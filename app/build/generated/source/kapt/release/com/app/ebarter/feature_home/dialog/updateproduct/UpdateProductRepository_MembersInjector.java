package com.app.ebarter.feature_home.dialog.updateproduct;

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
public final class UpdateProductRepository_MembersInjector implements MembersInjector<UpdateProductRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public UpdateProductRepository_MembersInjector(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  public static MembersInjector<UpdateProductRepository> create(
      Provider<StorageData> storageProvider, Provider<ImageFactory> imageFactoryProvider) {
    return new UpdateProductRepository_MembersInjector(storageProvider, imageFactoryProvider);
  }

  @Override
  public void injectMembers(UpdateProductRepository instance) {
    injectStorage(instance, storageProvider.get());
    injectImageFactory(instance, imageFactoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository.storage")
  public static void injectStorage(UpdateProductRepository instance, StorageData storage) {
    instance.storage = storage;
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository.imageFactory")
  public static void injectImageFactory(UpdateProductRepository instance,
      ImageFactory imageFactory) {
    instance.imageFactory = imageFactory;
  }
}
