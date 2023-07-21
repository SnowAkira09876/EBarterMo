package com.app.ebarter.feature_home.dialog.addoffer;

import com.app.ebarter.core.StorageData;
import com.app.ebarter.utils.ImageFactory;
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
public final class AddOfferRepository_Factory implements Factory<AddOfferRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public AddOfferRepository_Factory(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  @Override
  public AddOfferRepository get() {
    AddOfferRepository instance = newInstance();
    AddOfferRepository_MembersInjector.injectStorage(instance, storageProvider.get());
    AddOfferRepository_MembersInjector.injectImageFactory(instance, imageFactoryProvider.get());
    return instance;
  }

  public static AddOfferRepository_Factory create(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    return new AddOfferRepository_Factory(storageProvider, imageFactoryProvider);
  }

  public static AddOfferRepository newInstance() {
    return new AddOfferRepository();
  }
}
