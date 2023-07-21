package com.app.ebarter.feature_home.dialog.addproduct;

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
public final class AddProductWorker_AssistedFactory_Impl implements AddProductWorker_AssistedFactory {
  private final AddProductWorker_Factory delegateFactory;

  AddProductWorker_AssistedFactory_Impl(AddProductWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AddProductWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<AddProductWorker_AssistedFactory> create(
      AddProductWorker_Factory delegateFactory) {
    return InstanceFactory.create(new AddProductWorker_AssistedFactory_Impl(delegateFactory));
  }
}
