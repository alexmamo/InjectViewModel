package ro.alexmamo.injectviewmodel;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import ro.alexmamo.injectviewmodel.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder()
                .application(this)
                .build();
    }
}