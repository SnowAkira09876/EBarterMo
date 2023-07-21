package com.app.ebarter.feature_profile.dialog.profile;

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
public final class UpdateProfileRepository_Factory implements Factory<UpdateProfileRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public UpdateProfileRepository_Factory(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  @Override
  public UpdateProfileRepository get() {
    UpdateProfileRepository instance = newInstance();
    UpdateProfileRepository_MembersInjector.injectStorage(instance, storageProvider.get());
    UpdateProfileRepository_MembersInjector.injectImageFactory(instance, imageFactoryProvider.get());
    return instance;
  }

  public static UpdateProfileRepository_Factory create(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    return new UpdateProfileRepository_Factory(storageProvider, imageFactoryProvider);
  }

  public static UpdateProfileRepository newInstance() {
    return new UpdateProfileRepository();
  }
}
