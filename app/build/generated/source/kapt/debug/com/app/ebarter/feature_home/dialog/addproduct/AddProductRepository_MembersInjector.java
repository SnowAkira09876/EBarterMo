package com.app.ebarter.feature_home.dialog.addproduct;

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
public final class AddProductRepository_MembersInjector implements MembersInjector<AddProductRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public AddProductRepository_MembersInjector(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  public static MembersInjector<AddProductRepository> create(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    return new AddProductRepository_MembersInjector(storageProvider, imageFactoryProvider);
  }

  @Override
  public void injectMembers(AddProductRepository instance) {
    injectStorage(instance, storageProvider.get());
    injectImageFactory(instance, imageFactoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addproduct.AddProductRepository.storage")
  public static void injectStorage(AddProductRepository instance, StorageData storage) {
    instance.storage = storage;
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addproduct.AddProductRepository.imageFactory")
  public static void injectImageFactory(AddProductRepository instance, ImageFactory imageFactory) {
    instance.imageFactory = imageFactory;
  }
}
