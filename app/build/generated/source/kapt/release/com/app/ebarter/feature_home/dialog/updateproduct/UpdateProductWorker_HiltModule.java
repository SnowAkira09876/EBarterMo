package com.app.ebarter.feature_home.dialog.updateproduct;

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
    topLevelClass = UpdateProductWorker.class
)
public interface UpdateProductWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      UpdateProductWorker_AssistedFactory factory);
}
