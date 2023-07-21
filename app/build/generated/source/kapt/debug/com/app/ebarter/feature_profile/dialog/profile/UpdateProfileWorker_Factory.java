package com.app.ebarter.feature_profile.dialog.profile;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
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
public final class UpdateProfileWorker_Factory {
  private final Provider<UpdateProfileRepository> updateProfileRepositoryProvider;

  public UpdateProfileWorker_Factory(
      Provider<UpdateProfileRepository> updateProfileRepositoryProvider) {
    this.updateProfileRepositoryProvider = updateProfileRepositoryProvider;
  }

  public UpdateProfileWorker get(Context context, WorkerParameters params) {
    UpdateProfileWorker instance = newInstance(context, params);
    UpdateProfileWorker_MembersInjector.injectUpdateProfileRepository(instance, updateProfileRepositoryProvider.get());
    return instance;
  }

  public static UpdateProfileWorker_Factory create(
      Provider<UpdateProfileRepository> updateProfileRepositoryProvider) {
    return new UpdateProfileWorker_Factory(updateProfileRepositoryProvider);
  }

  public static UpdateProfileWorker newInstance(Context context, WorkerParameters params) {
    return new UpdateProfileWorker(context, params);
  }
}
