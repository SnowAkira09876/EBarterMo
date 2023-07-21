package com.app.ebarter.feature_profile.dialog.profile;

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
public final class UpdateProfileWorker_MembersInjector implements MembersInjector<UpdateProfileWorker> {
  private final Provider<UpdateProfileRepository> updateProfileRepositoryProvider;

  public UpdateProfileWorker_MembersInjector(
      Provider<UpdateProfileRepository> updateProfileRepositoryProvider) {
    this.updateProfileRepositoryProvider = updateProfileRepositoryProvider;
  }

  public static MembersInjector<UpdateProfileWorker> create(
      Provider<UpdateProfileRepository> updateProfileRepositoryProvider) {
    return new UpdateProfileWorker_MembersInjector(updateProfileRepositoryProvider);
  }

  @Override
  public void injectMembers(UpdateProfileWorker instance) {
    injectUpdateProfileRepository(instance, updateProfileRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker.updateProfileRepository")
  public static void injectUpdateProfileRepository(UpdateProfileWorker instance,
      UpdateProfileRepository updateProfileRepository) {
    instance.updateProfileRepository = updateProfileRepository;
  }
}
