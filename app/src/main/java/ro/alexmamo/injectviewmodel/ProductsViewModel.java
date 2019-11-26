package ro.alexmamo.injectviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.firestore.CollectionReference;

import java.util.List;

import javax.inject.Inject;

public class ProductsViewModel extends ViewModel {
    LiveData<List<Product>> productListLiveData;

    @Inject
    ProductsViewModel(CollectionReference productsRef) {
        ProductsRepository productsRepository = new ProductsRepository(productsRef);
        productListLiveData = productsRepository.getProductMutableLiveData();
    }
}