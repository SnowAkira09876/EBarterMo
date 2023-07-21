package com.app.ebarter.feature_home;

import com.app.ebarter.core.StorageData;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<StorageData> storageDataProvider;

  public HomeViewModel_Factory(Provider<StorageData> storageDataProvider) {
    this.storageDataProvider = storageDataProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(storageDataProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<StorageData> storageDataProvider) {
    return new HomeViewModel_Factory(storageDataProvider);
  }

  public static HomeViewModel newInstance(StorageData storageData) {
    return new HomeViewModel(storageData);
  }
}
