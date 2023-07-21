package com.app.ebarter.feature_profile.dialog.profile;

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
public final class UpdateProfileWorker_AssistedFactory_Impl implements UpdateProfileWorker_AssistedFactory {
  private final UpdateProfileWorker_Factory delegateFactory;

  UpdateProfileWorker_AssistedFactory_Impl(UpdateProfileWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public UpdateProfileWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<UpdateProfileWorker_AssistedFactory> create(
      UpdateProfileWorker_Factory delegateFactory) {
    return InstanceFactory.create(new UpdateProfileWorker_AssistedFactory_Impl(delegateFactory));
  }
}
