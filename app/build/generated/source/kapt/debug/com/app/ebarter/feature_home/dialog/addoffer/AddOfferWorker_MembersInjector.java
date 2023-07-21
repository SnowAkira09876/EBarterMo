package com.app.ebarter.feature_home.dialog.addoffer;

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
public final class AddOfferWorker_MembersInjector implements MembersInjector<AddOfferWorker> {
  private final Provider<AddOfferRepository> addOfferRepositoryProvider;

  public AddOfferWorker_MembersInjector(Provider<AddOfferRepository> addOfferRepositoryProvider) {
    this.addOfferRepositoryProvider = addOfferRepositoryProvider;
  }

  public static MembersInjector<AddOfferWorker> create(
      Provider<AddOfferRepository> addOfferRepositoryProvider) {
    return new AddOfferWorker_MembersInjector(addOfferRepositoryProvider);
  }

  @Override
  public void injectMembers(AddOfferWorker instance) {
    injectAddOfferRepository(instance, addOfferRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker.addOfferRepository")
  public static void injectAddOfferRepository(AddOfferWorker instance,
      AddOfferRepository addOfferRepository) {
    instance.addOfferRepository = addOfferRepository;
  }
}
