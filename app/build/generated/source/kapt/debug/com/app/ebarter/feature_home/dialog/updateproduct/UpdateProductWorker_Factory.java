package com.app.ebarter.feature_home.dialog.updateproduct;

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
public final class UpdateProductWorker_Factory {
  private final Provider<UpdateProductRepository> updateProductRepositoryProvider;

  public UpdateProductWorker_Factory(
      Provider<UpdateProductRepository> updateProductRepositoryProvider) {
    this.updateProductRepositoryProvider = updateProductRepositoryProvider;
  }

  public UpdateProductWorker get(Context context, WorkerParameters params) {
    UpdateProductWorker instance = newInstance(context, params);
    UpdateProductWorker_MembersInjector.injectUpdateProductRepository(instance, updateProductRepositoryProvider.get());
    return instance;
  }

  public static UpdateProductWorker_Factory create(
      Provider<UpdateProductRepository> updateProductRepositoryProvider) {
    return new UpdateProductWorker_Factory(updateProductRepositoryProvider);
  }

  public static UpdateProductWorker newInstance(Context context, WorkerParameters params) {
    return new UpdateProductWorker(context, params);
  }
}
