package com.app.ebarter.feature_home.dialog.addoffer;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AddOfferWorker_Factory {
  private final Provider<AddOfferRepository> addOfferRepositoryProvider;

  public AddOfferWorker_Factory(Provider<AddOfferRepository> addOfferRepositoryProvider) {
    this.addOfferRepositoryProvider = addOfferRepositoryProvider;
  }

  public AddOfferWorker get(Context context, WorkerParameters params) {
    AddOfferWorker instance = newInstance(context, params);
    AddOfferWorker_MembersInjector.injectAddOfferRepository(instance, addOfferRepositoryProvider.get());
    return instance;
  }

  public static AddOfferWorker_Factory create(
      Provider<AddOfferRepository> addOfferRepositoryProvider) {
    return new AddOfferWorker_Factory(addOfferRepositoryProvider);
  }

  public static AddOfferWorker newInstance(Context context, WorkerParameters params) {
    return new AddOfferWorker(context, params);
  }
}
