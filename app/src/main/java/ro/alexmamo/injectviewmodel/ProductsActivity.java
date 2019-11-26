package ro.alexmamo.injectviewmodel;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class ProductsActivity extends DaggerAppCompatActivity {
    @Inject ProductsViewModel productsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        getProductList();
    }

    private void getProductList() {
        productsViewModel.productListLiveData.observe(this, productList -> {
            //Do what you need to do with the list
        });
    }
}