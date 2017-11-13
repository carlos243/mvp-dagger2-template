package cl.carlostapia.mvpdagger2template.application;

import android.app.Application;

import cl.carlostapia.mvpdagger2template.application.builder.AppContextModule;


/**
 * Created by Administrador on 09-11-2017.
 */

public class AppComponent extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initAppComponent();
    }

    public void initAppComponent() {
        this.appComponent = DaggerAppComponent.builder().appContextModule(new AppContextModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return this.appComponent;
    }
}
