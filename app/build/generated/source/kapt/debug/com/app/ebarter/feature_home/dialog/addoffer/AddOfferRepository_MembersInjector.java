package com.app.ebarter.feature_home.dialog.addoffer;

import com.app.ebarter.core.StorageData;
import com.app.ebarter.utils.ImageFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AddOfferRepository_MembersInjector implements MembersInjector<AddOfferRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public AddOfferRepository_MembersInjector(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  public static MembersInjector<AddOfferRepository> create(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    return new AddOfferRepository_MembersInjector(storageProvider, imageFactoryProvider);
  }

  @Override
  public void injectMembers(AddOfferRepository instance) {
    injectStorage(instance, storageProvider.get());
    injectImageFactory(instance, imageFactoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addoffer.AddOfferRepository.storage")
  public static void injectStorage(AddOfferRepository instance, StorageData storage) {
    instance.storage = storage;
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addoffer.AddOfferRepository.imageFactory")
  public static void injectImageFactory(AddOfferRepository instance, ImageFactory imageFactory) {
    instance.imageFactory = imageFactory;
  }
}
