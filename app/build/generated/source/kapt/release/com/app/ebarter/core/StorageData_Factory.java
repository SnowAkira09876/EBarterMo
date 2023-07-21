package com.app.ebarter.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class StorageData_Factory implements Factory<StorageData> {
  @Override
  public StorageData get() {
    return newInstance();
  }

  public static StorageData_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StorageData newInstance() {
    return new StorageData();
  }

  private static final class InstanceHolder {
    private static final StorageData_Factory INSTANCE = new StorageData_Factory();
  }
}
