package com.app.ebarter.pojos

import android.os.Parcel
import android.os.Parcelable
import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

class ProductModel() : Parcelable {
    // Owner
    var id: String? = null
    var ownerId: String? = null
    var ownerUserName: String? = null

    var description: String? = null
    var category: String? = null
    var phone: String? = null
    var location: String? = null
    var reason: String? = null
    var details: String? = null
    var payment: String? = null

    var imageLink: String? = null
    var storagePath: String? = null
    var profileLink: String? = null
    var filePathUri: String? = null

    // Request
    var requestId: String? = null
    var requestProfileLink: String? = null
    var requestUserId: String? = null
    var requestUserName: String? = null
    var requestUserLocation: String? = null
    var requestUserContact: String? = null
    var requestDescription: String? = null
    var requestDetails: String? = null
    var requestStatus: String? = null

    var requestImageLink: String? = null
    var requestFilePathUri: String? = null
    var requestStoragePath: String? = null

    @ServerTimestamp
    var date: Date? = null

    private constructor(parcel: Parcel) : this() {
        id = parcel.readString()
        ownerId = parcel.readString()
        ownerUserName = parcel.readString()

        description = parcel.readString()
        category = parcel.readString()
        phone = parcel.readString()
        location = parcel.readString()
        reason = parcel.readString()
        details = parcel.readString()
        payment = parcel.readString()

        imageLink = parcel.readString()
        storagePath = parcel.readString()
        profileLink = parcel.readString()
        filePathUri = parcel.readString()
        val time = parcel.readLong()
        date = Date(time)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flag: Int) {
        dest.writeString(id)
        dest.writeString(ownerId)
        dest.writeString(ownerUserName)

        dest.writeString(description)
        dest.writeString(category)
        dest.writeString(phone)
        dest.writeString(location)
        dest.writeString(reason)
        dest.writeString(details)
        dest.writeString(payment)

        dest.writeString(imageLink)
        dest.writeString(storagePath)
        dest.writeString(profileLink)
        dest.writeString(filePathUri)
        dest.writeLong(date!!.time)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<ProductModel> = object : Parcelable.Creator<ProductModel> {
            override fun createFromParcel(`in`: Parcel): ProductModel {
                return ProductModel(`in`)
            }

            override fun newArray(size: Int): Array<ProductModel?> {
                return arrayOfNulls(size)
            }
        }
    }
}