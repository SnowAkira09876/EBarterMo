package com.app.ebarter.feature_home.dialog.addproduct;

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
public final class AddProductWorker_Factory {
  private final Provider<AddProductRepository> addProductRepositoryProvider;

  public AddProductWorker_Factory(Provider<AddProductRepository> addProductRepositoryProvider) {
    this.addProductRepositoryProvider = addProductRepositoryProvider;
  }

  public AddProductWorker get(Context context, WorkerParameters params) {
    AddProductWorker instance = newInstance(context, params);
    AddProductWorker_MembersInjector.injectAddProductRepository(instance, addProductRepositoryProvider.get());
    return instance;
  }

  public static AddProductWorker_Factory create(
      Provider<AddProductRepository> addProductRepositoryProvider) {
    return new AddProductWorker_Factory(addProductRepositoryProvider);
  }

  public static AddProductWorker newInstance(Context context, WorkerParameters params) {
    return new AddProductWorker(context, params);
  }
}
