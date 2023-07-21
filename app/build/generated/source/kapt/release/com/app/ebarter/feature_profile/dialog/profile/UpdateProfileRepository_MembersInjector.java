package com.app.ebarter.feature_profile.dialog.profile;

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
public final class UpdateProfileRepository_MembersInjector implements MembersInjector<UpdateProfileRepository> {
  private final Provider<StorageData> storageProvider;

  private final Provider<ImageFactory> imageFactoryProvider;

  public UpdateProfileRepository_MembersInjector(Provider<StorageData> storageProvider,
      Provider<ImageFactory> imageFactoryProvider) {
    this.storageProvider = storageProvider;
    this.imageFactoryProvider = imageFactoryProvider;
  }

  public static MembersInjector<UpdateProfileRepository> create(
      Provider<StorageData> storageProvider, Provider<ImageFactory> imageFactoryProvider) {
    return new UpdateProfileRepository_MembersInjector(storageProvider, imageFactoryProvider);
  }

  @Override
  public void injectMembers(UpdateProfileRepository instance) {
    injectStorage(instance, storageProvider.get());
    injectImageFactory(instance, imageFactoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository.storage")
  public static void injectStorage(UpdateProfileRepository instance, StorageData storage) {
    instance.storage = storage;
  }

  @InjectedFieldSignature("com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository.imageFactory")
  public static void injectImageFactory(UpdateProfileRepository instance,
      ImageFactory imageFactory) {
    instance.imageFactory = imageFactory;
  }
}
