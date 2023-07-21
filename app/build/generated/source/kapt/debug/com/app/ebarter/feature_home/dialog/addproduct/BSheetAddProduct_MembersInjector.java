package com.app.ebarter.feature_home.dialog.addproduct;

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
public final class BSheetAddProduct_MembersInjector implements MembersInjector<BSheetAddProduct> {
  private final Provider<ImageFactory> imageFactoryProvider;

  public BSheetAddProduct_MembersInjector(Provider<ImageFactory> imageFactoryProvider) {
    this.imageFactoryProvider = imageFactoryProvider;
  }

  public static MembersInjector<BSheetAddProduct> create(
      Provider<ImageFactory> imageFactoryProvider) {
    return new BSheetAddProduct_MembersInjector(imageFactoryProvider);
  }

  @Override
  public void injectMembers(BSheetAddProduct instance) {
    injectImageFactory(instance, imageFactoryProvider.get());
  }

  @InjectedFieldSignature("com.app.ebarter.feature_home.dialog.addproduct.BSheetAddProduct.imageFactory")
  public static void injectImageFactory(BSheetAddProduct instance, ImageFactory imageFactory) {
    instance.imageFactory = imageFactory;
  }
}
