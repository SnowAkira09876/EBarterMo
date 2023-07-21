package com.app.ebarter.feature_home.dialog.addoffer;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AddOfferWorker_AssistedFactory_Impl implements AddOfferWorker_AssistedFactory {
  private final AddOfferWorker_Factory delegateFactory;

  AddOfferWorker_AssistedFactory_Impl(AddOfferWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AddOfferWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<AddOfferWorker_AssistedFactory> create(
      AddOfferWorker_Factory delegateFactory) {
    return InstanceFactory.create(new AddOfferWorker_AssistedFactory_Impl(delegateFactory));
  }
}
