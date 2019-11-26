package ro.alexmamo.injectviewmodel.di;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static ro.alexmamo.injectviewmodel.Constants.PRODUCTS_COLLECTION;

@Module
class AppModule {
    @Singleton
    @Provides
    static FirebaseFirestore provideFirebaseFirestore() {
        return FirebaseFirestore.getInstance();
    }

    @Singleton
    @Provides
    static CollectionReference provideProductsCollectionReference(FirebaseFirestore rootRef) {
        return rootRef.collection(PRODUCTS_COLLECTION);
    }
}