package com.app.ebarter.feature_home.dialog.addproduct;

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
    topLevelClass = AddProductWorker.class
)
public interface AddProductWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(AddProductWorker_AssistedFactory factory);
}
