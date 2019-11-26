package ro.alexmamo.injectviewmodel.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ro.alexmamo.injectviewmodel.ProductsViewModel;
import ro.alexmamo.injectviewmodel.ProductsViewModelFactory;

@Module
@SuppressWarnings("unused")
abstract class ProductsViewModelModule {
    @Binds
    abstract ViewModelProvider.Factory bindAppViewModelFactory(ProductsViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(ProductsViewModel.class)
    abstract ViewModel provideProductsViewModel(ProductsViewModel viewModel);
}