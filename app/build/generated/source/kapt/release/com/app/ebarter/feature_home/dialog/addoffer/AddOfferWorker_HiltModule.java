package com.app.ebarter.feature_home.dialog.addoffer;

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
    topLevelClass = AddOfferWorker.class
)
public interface AddOfferWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(AddOfferWorker_AssistedFactory factory);
}
