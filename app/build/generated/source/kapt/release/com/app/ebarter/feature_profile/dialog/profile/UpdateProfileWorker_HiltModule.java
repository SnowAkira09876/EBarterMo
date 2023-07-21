package com.app.ebarter.feature_profile.dialog.profile;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.processing.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = UpdateProfileWorker.class
)
public interface UpdateProfileWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      UpdateProfileWorker_AssistedFactory factory);
}
