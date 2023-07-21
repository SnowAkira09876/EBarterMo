package com.app.ebarter.feature_home.dialog.updateproduct;

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
public final class UpdateProductRepository_Factory implements Factory<UpdateProductRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public UpdateProductRepository_Factory(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  @Override
  public UpdateProductRepository get() {
    UpdateProductRepository instance = newInstance();
    UpdateProductRepository_MembersInjector.injectStorage(instance, storageProvider.get());
    UpdateProductRepository_MembersInjector.injectImageFactory(instance, imageFactoryProvider.get());
    return instance;
  }

  public static UpdateProductRepository_Factory create(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    return new UpdateProductRepository_Factory(storageProvider, imageFactoryProvider);
  }

  public static UpdateProductRepository newInstance() {
    return new UpdateProductRepository();
  }
}
