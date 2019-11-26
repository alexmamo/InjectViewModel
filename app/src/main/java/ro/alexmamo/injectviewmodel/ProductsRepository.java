package ro.alexmamo.injectviewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import static ro.alexmamo.injectviewmodel.Constants.*;

@SuppressWarnings("ConstantConditions")
@Singleton
class ProductsRepository {
    private CollectionReference productsRef;

    ProductsRepository(CollectionReference productsRef) {
        this.productsRef = productsRef;
    }

    MutableLiveData<List<Product>> getProductMutableLiveData() {
        MutableLiveData<List<Product>> productListMutableLiveData = new MutableLiveData<>();
        productsRef.get().addOnCompleteListener(productListTask -> {
            if (productListTask.isSuccessful()) {
                List<Product> productList = new ArrayList<>();
                for (QueryDocumentSnapshot document : productListTask.getResult()) {
                    Product product = document.toObject(Product.class);
                    productList.add(product);
                }
                productListMutableLiveData.setValue(productList);
            } else {
                Log.d(TAG, productListTask.getException().getMessage());
            }
        });
        return productListMutableLiveData;
    }
}