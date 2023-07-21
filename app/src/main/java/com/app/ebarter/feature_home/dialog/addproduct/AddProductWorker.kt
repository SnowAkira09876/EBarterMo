package com.app.ebarter.feature_home.dialog.addproduct

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.hilt.work.HiltWorker
import androidx.work.WorkerParameters
import androidx.work.rxjava3.RxWorker
import com.app.ebarter.R
import com.app.ebarter.StartApplication
import com.app.ebarter.feature_home.common.HomeConstants.CATEGORY
import com.app.ebarter.feature_home.common.HomeConstants.DESCRIPTION
import com.app.ebarter.feature_home.common.HomeConstants.DETAILS
import com.app.ebarter.feature_home.common.HomeConstants.FILEPATHURI
import com.app.ebarter.feature_home.common.HomeConstants.LOCATION
import com.app.ebarter.feature_home.common.HomeConstants.PAYMENT
import com.app.ebarter.feature_home.common.HomeConstants.PHONE
import com.app.ebarter.feature_home.common.HomeConstants.PROFILELINK
import com.app.ebarter.feature_home.common.HomeConstants.REASON
import com.app.ebarter.feature_home.common.HomeConstants.USERID
import com.app.ebarter.feature_home.common.HomeConstants.USERNAME
import com.app.ebarter.pojos.ProductModel
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleEmitter
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltWorker
class AddProductWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters
) : RxWorker(context, params) {
    @Inject
    lateinit var addProductRepository: AddProductRepository

    private val post: NotificationCompat.Builder
    private val notificationManager: NotificationManager

    init {
        notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        post = getNotificationBuilder(context)
    }

    override fun createWork(): Single<Result> {
        return Single.create { emitter: SingleEmitter<Result> ->
            ProductModel().apply {
                ownerId = inputData.getString(USERID)
                ownerUserName = inputData.getString(USERNAME)

                description = inputData.getString(DESCRIPTION)
                category = inputData.getString(CATEGORY)
                phone = inputData.getString(PHONE)
                location = inputData.getString(LOCATION)
                reason = inputData.getString(REASON)
                details = inputData.getString(DETAILS)
                payment = inputData.getString(PAYMENT)

                filePathUri = inputData.getString(FILEPATHURI)
                profileLink = inputData.getString(PROFILELINK)
                requestStatus = "Uploading"
            }.also {
                val disposable = addProductRepository.addProduct(it)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { progress: Int ->
                        post.setProgress(100, progress, false)
                        post.setOngoing(true)
                        notificationManager.notify(POST_ID, post.build())
                        if (progress == 100) {
                            emitter.onSuccess(Result.success())
                            notificationManager.cancel(POST_ID)
                        }
                    }
                emitter.setCancellable { disposable.dispose() }
            }
        }
    }

    private fun getNotificationBuilder(
        context: Context
    ): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, StartApplication.POST)
            .setContentTitle("Uploading Product")
            .setSmallIcon(R.drawable.ic_notification)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
    }

    companion object {
        private const val POST_ID = 0
    }
}