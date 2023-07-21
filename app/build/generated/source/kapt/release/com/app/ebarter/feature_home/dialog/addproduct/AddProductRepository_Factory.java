package com.app.ebarter.feature_home.dialog.addproduct;

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
public final class AddProductRepository_Factory implements Factory<AddProductRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public AddProductRepository_Factory(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  @Override
  public AddProductRepository get() {
    AddProductRepository instance = newInstance();
    AddProductRepository_MembersInjector.injectStorage(instance, storageProvider.get());
    AddProductRepository_MembersInjector.injectImageFactory(instance, imageFactoryProvider.get());
    return instance;
  }

  public static AddProductRepository_Factory create(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    return new AddProductRepository_Factory(storageProvider, imageFactoryProvider);
  }

  public static AddProductRepository newInstance() {
    return new AddProductRepository();
  }
}
