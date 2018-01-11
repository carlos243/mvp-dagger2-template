package cl.carlostapia.mvpdagger2template.application;

import android.app.Application;

import cl.carlostapia.mvpdagger2template.application.dagger.app.AppComponent;
import cl.carlostapia.mvpdagger2template.application.builder.DaggerAppComponent;
import cl.carlostapia.mvpdagger2template.application.dagger.DaggerServiceComponent;
import cl.carlostapia.mvpdagger2template.application.dagger.service.ServiceComponent;

/**
 * Created by Administrador on 09-11-2017.
 */

public class AppController extends Application {

    private static AppComponent appComponent;
    private static ServiceComponent serviceComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        this.initAppComponent();
    }

    public void initAppComponent(){
        appComponent = DaggerAppComponent.builder()
                .build();
        serviceComponent = DaggerServiceComponent.builder()
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static ServiceComponent getServiceComponent(){
        return serviceComponent;
    }
}
