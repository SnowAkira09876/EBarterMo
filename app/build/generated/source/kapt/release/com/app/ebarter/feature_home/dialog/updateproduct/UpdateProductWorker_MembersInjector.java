package com.app.ebarter.feature_home.dialog.updateproduct;

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
public final class UpdateProductWorker_MembersInjector implements MembersInjector<UpdateProductWorker> {
  private final Provider<UpdateProductRepository> updateProductRepositoryProvider;

  public UpdateProductWorker_MembersInjector(
      Provider<UpdateProductRepository> updateProductRepositoryProvider) {
    this.updateProductRepositoryProvider = updateProductRepositoryProvider;
  }

  public static MembersInjector<UpdateProductWorker> create(
      Provider<UpdateProductRepository> updateProductRepositoryProvider) {
    return new UpdateProductWorker_MembersInjector(updateProductRepositoryProvider);
  }

  @Override
  public void injectMembers(UpdateProductWorker instance) {
    injectUpdateProductRepository(instance, updateProductRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker.updateProductRepository")
  public static void injectUpdateProductRepository(UpdateProductWorker instance,
      UpdateProductRepository updateProductRepository) {
    instance.updateProductRepository = updateProductRepository;
  }
}
