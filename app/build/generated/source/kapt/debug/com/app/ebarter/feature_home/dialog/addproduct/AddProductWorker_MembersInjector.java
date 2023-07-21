package com.app.ebarter.feature_home.dialog.addproduct;

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
public final class AddProductWorker_MembersInjector implements MembersInjector<AddProductWorker> {
  private final Provider<AddProductRepository> addProductRepositoryProvider;

  public AddProductWorker_MembersInjector(
      Provider<AddProductRepository> addProductRepositoryProvider) {
    this.addProductRepositoryProvider = addProductRepositoryProvider;
  }

  public static MembersInjector<AddProductWorker> create(
      Provider<AddProductRepository> addProductRepositoryProvider) {
    return new AddProductWorker_MembersInjector(addProductRepositoryProvider);
  }

  @Override
  public void injectMembers(AddProductWorker instance) {
    injectAddProductRepository(instance, addProductRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker.addProductRepository")
  public static void injectAddProductRepository(AddProductWorker instance,
      AddProductRepository addProductRepository) {
    instance.addProductRepository = addProductRepository;
  }
}
