package com.app.ebarter.feature_home.dialog.updateproduct;

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
public final class UpdateProductWorker_AssistedFactory_Impl implements UpdateProductWorker_AssistedFactory {
  private final UpdateProductWorker_Factory delegateFactory;

  UpdateProductWorker_AssistedFactory_Impl(UpdateProductWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public UpdateProductWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<UpdateProductWorker_AssistedFactory> create(
      UpdateProductWorker_Factory delegateFactory) {
    return InstanceFactory.create(new UpdateProductWorker_AssistedFactory_Impl(delegateFactory));
  }
}
