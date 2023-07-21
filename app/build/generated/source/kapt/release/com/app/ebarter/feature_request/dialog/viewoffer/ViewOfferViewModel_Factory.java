package com.app.ebarter.feature_request.dialog.viewoffer;

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
public final class ViewOfferViewModel_Factory implements Factory<ViewOfferViewModel> {
  private final Provider<StorageData> storageDataProvider;

  public ViewOfferViewModel_Factory(Provider<StorageData> storageDataProvider) {
    this.storageDataProvider = storageDataProvider;
  }

  @Override
  public ViewOfferViewModel get() {
    return newInstance(storageDataProvider.get());
  }

  public static ViewOfferViewModel_Factory create(Provider<StorageData> storageDataProvider) {
    return new ViewOfferViewModel_Factory(storageDataProvider);
  }

  public static ViewOfferViewModel newInstance(StorageData storageData) {
    return new ViewOfferViewModel(storageData);
  }
}
