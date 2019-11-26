package ro.alexmamo.injectviewmodel.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ro.alexmamo.injectviewmodel.ProductsActivity;

@Module
@SuppressWarnings("unused")
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract ProductsActivity contributeProductsActivity();
}