package com.app.ebarter.utils;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class ImageFactory_Factory implements Factory<ImageFactory> {
  private final Provider<Context> contextProvider;

  public ImageFactory_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ImageFactory get() {
    return newInstance(contextProvider.get());
  }

  public static ImageFactory_Factory create(Provider<Context> contextProvider) {
    return new ImageFactory_Factory(contextProvider);
  }

  public static ImageFactory newInstance(Context context) {
    return new ImageFactory(context);
  }
}
