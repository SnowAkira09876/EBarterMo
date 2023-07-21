package com.app.ebarter;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.HiltWrapper_WorkerFactoryModule;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.app.ebarter.core.StorageData;
import com.app.ebarter.feature_home.HomeFragment;
import com.app.ebarter.feature_home.HomeViewModel;
import com.app.ebarter.feature_home.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferRepository;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferRepository_Factory;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferRepository_MembersInjector;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker_AssistedFactory;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker_Factory;
import com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker_MembersInjector;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductRepository;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductRepository_Factory;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductRepository_MembersInjector;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker_AssistedFactory;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker_Factory;
import com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker_MembersInjector;
import com.app.ebarter.feature_home.dialog.addproduct.BSheetAddProduct;
import com.app.ebarter.feature_home.dialog.addproduct.BSheetAddProduct_MembersInjector;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository_Factory;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository_MembersInjector;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker_AssistedFactory;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker_Factory;
import com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker_MembersInjector;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository_Factory;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository_MembersInjector;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker_AssistedFactory;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker_Factory;
import com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker_MembersInjector;
import com.app.ebarter.feature_request.dialog.viewoffer.BSheetViewOffer;
import com.app.ebarter.feature_request.dialog.viewoffer.ViewOfferViewModel;
import com.app.ebarter.feature_request.dialog.viewoffer.ViewOfferViewModel_HiltModules_KeyModule_ProvideFactory;
import com.app.ebarter.feature_review.ReviewFragment;
import com.app.ebarter.feature_signin.SignInActivity;
import com.app.ebarter.feature_signup.SignUpActivity;
import com.app.ebarter.utils.ImageFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DaggerStartApplication_HiltComponents_SingletonC {
  private DaggerStartApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_WorkerFactoryModule(
        HiltWrapper_WorkerFactoryModule hiltWrapper_WorkerFactoryModule) {
      Preconditions.checkNotNull(hiltWrapper_WorkerFactoryModule);
      return this;
    }

    public StartApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements StartApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public StartApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements StartApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public StartApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements StartApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public StartApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements StartApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public StartApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements StartApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public StartApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements StartApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public StartApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements StartApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public StartApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends StartApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends StartApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectHomeFragment(HomeFragment arg0) {
    }

    @Override
    public void injectBSheetAddProduct(BSheetAddProduct arg0) {
      injectBSheetAddProduct2(arg0);
    }

    @Override
    public void injectBSheetViewOffer(BSheetViewOffer arg0) {
    }

    @Override
    public void injectReviewFragment(ReviewFragment arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @CanIgnoreReturnValue
    private BSheetAddProduct injectBSheetAddProduct2(BSheetAddProduct instance) {
      BSheetAddProduct_MembersInjector.injectImageFactory(instance, singletonCImpl.imageFactory());
      return instance;
    }
  }

  private static final class ViewCImpl extends StartApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends StartApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public void injectSignInActivity(SignInActivity arg0) {
    }

    @Override
    public void injectSignUpActivity(SignUpActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ViewOfferViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends StartApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<ViewOfferViewModel> viewOfferViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.viewOfferViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>of("com.app.ebarter.feature_home.HomeViewModel", ((Provider) homeViewModelProvider), "com.app.ebarter.feature_request.dialog.viewoffer.ViewOfferViewModel", ((Provider) viewOfferViewModelProvider));
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.app.ebarter.feature_home.HomeViewModel 
          return (T) new HomeViewModel(new StorageData());

          case 1: // com.app.ebarter.feature_request.dialog.viewoffer.ViewOfferViewModel 
          return (T) new ViewOfferViewModel(new StorageData());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends StartApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends StartApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends StartApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<AddOfferWorker_AssistedFactory> addOfferWorker_AssistedFactoryProvider;

    private Provider<AddProductWorker_AssistedFactory> addProductWorker_AssistedFactoryProvider;

    private Provider<UpdateProductWorker_AssistedFactory> updateProductWorker_AssistedFactoryProvider;

    private Provider<UpdateProfileWorker_AssistedFactory> updateProfileWorker_AssistedFactoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private ImageFactory imageFactory() {
      return new ImageFactory(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private AddOfferRepository addOfferRepository() {
      return injectAddOfferRepository(AddOfferRepository_Factory.newInstance());
    }

    private AddProductRepository addProductRepository() {
      return injectAddProductRepository(AddProductRepository_Factory.newInstance());
    }

    private UpdateProductRepository updateProductRepository() {
      return injectUpdateProductRepository(UpdateProductRepository_Factory.newInstance());
    }

    private UpdateProfileRepository updateProfileRepository() {
      return injectUpdateProfileRepository(UpdateProfileRepository_Factory.newInstance());
    }

    private Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> mapOfStringAndProviderOfWorkerAssistedFactoryOf(
        ) {
      return ImmutableMap.<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>of("com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker", ((Provider) addOfferWorker_AssistedFactoryProvider), "com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker", ((Provider) addProductWorker_AssistedFactoryProvider), "com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker", ((Provider) updateProductWorker_AssistedFactoryProvider), "com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker", ((Provider) updateProfileWorker_AssistedFactoryProvider));
    }

    private HiltWorkerFactory hiltWorkerFactory() {
      return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(mapOfStringAndProviderOfWorkerAssistedFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.addOfferWorker_AssistedFactoryProvider = SingleCheck.provider(new SwitchingProvider<AddOfferWorker_AssistedFactory>(singletonCImpl, 0));
      this.addProductWorker_AssistedFactoryProvider = SingleCheck.provider(new SwitchingProvider<AddProductWorker_AssistedFactory>(singletonCImpl, 1));
      this.updateProductWorker_AssistedFactoryProvider = SingleCheck.provider(new SwitchingProvider<UpdateProductWorker_AssistedFactory>(singletonCImpl, 2));
      this.updateProfileWorker_AssistedFactoryProvider = SingleCheck.provider(new SwitchingProvider<UpdateProfileWorker_AssistedFactory>(singletonCImpl, 3));
    }

    @Override
    public void injectStartApplication(StartApplication startApplication) {
      injectStartApplication2(startApplication);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @CanIgnoreReturnValue
    private AddOfferRepository injectAddOfferRepository(AddOfferRepository instance) {
      AddOfferRepository_MembersInjector.injectStorage(instance, new StorageData());
      AddOfferRepository_MembersInjector.injectImageFactory(instance, imageFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddOfferWorker injectAddOfferWorker(AddOfferWorker instance) {
      AddOfferWorker_MembersInjector.injectAddOfferRepository(instance, addOfferRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddProductRepository injectAddProductRepository(AddProductRepository instance) {
      AddProductRepository_MembersInjector.injectStorage(instance, new StorageData());
      AddProductRepository_MembersInjector.injectImageFactory(instance, imageFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddProductWorker injectAddProductWorker(AddProductWorker instance) {
      AddProductWorker_MembersInjector.injectAddProductRepository(instance, addProductRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private UpdateProductRepository injectUpdateProductRepository(
        UpdateProductRepository instance) {
      UpdateProductRepository_MembersInjector.injectStorage(instance, new StorageData());
      UpdateProductRepository_MembersInjector.injectImageFactory(instance, imageFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private UpdateProductWorker injectUpdateProductWorker(UpdateProductWorker instance) {
      UpdateProductWorker_MembersInjector.injectUpdateProductRepository(instance, updateProductRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private UpdateProfileRepository injectUpdateProfileRepository(
        UpdateProfileRepository instance) {
      UpdateProfileRepository_MembersInjector.injectStorage(instance, new StorageData());
      UpdateProfileRepository_MembersInjector.injectImageFactory(instance, imageFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private UpdateProfileWorker injectUpdateProfileWorker(UpdateProfileWorker instance) {
      UpdateProfileWorker_MembersInjector.injectUpdateProfileRepository(instance, updateProfileRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private StartApplication injectStartApplication2(StartApplication instance) {
      StartApplication_MembersInjector.injectWorkerFactory(instance, hiltWorkerFactory());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.app.ebarter.feature_home.dialog.addoffer.AddOfferWorker_AssistedFactory 
          return (T) new AddOfferWorker_AssistedFactory() {
            @Override
            public AddOfferWorker create(Context context, WorkerParameters params) {
              return singletonCImpl.injectAddOfferWorker(AddOfferWorker_Factory.newInstance(context, params));
            }
          };

          case 1: // com.app.ebarter.feature_home.dialog.addproduct.AddProductWorker_AssistedFactory 
          return (T) new AddProductWorker_AssistedFactory() {
            @Override
            public AddProductWorker create(Context context2, WorkerParameters params2) {
              return singletonCImpl.injectAddProductWorker(AddProductWorker_Factory.newInstance(context2, params2));
            }
          };

          case 2: // com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker_AssistedFactory 
          return (T) new UpdateProductWorker_AssistedFactory() {
            @Override
            public UpdateProductWorker create(Context context3, WorkerParameters params3) {
              return singletonCImpl.injectUpdateProductWorker(UpdateProductWorker_Factory.newInstance(context3, params3));
            }
          };

          case 3: // com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker_AssistedFactory 
          return (T) new UpdateProfileWorker_AssistedFactory() {
            @Override
            public UpdateProfileWorker create(Context context4, WorkerParameters params4) {
              return singletonCImpl.injectUpdateProfileWorker(UpdateProfileWorker_Factory.newInstance(context4, params4));
            }
          };

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
