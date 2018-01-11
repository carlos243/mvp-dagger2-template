package cl.carlostapia.mvpdagger2template.application.dagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CarlosTapia on 12-11-17.
 *
 * dagger busca entre los @Module y los metodos disponibles que proovean instancias @Provides
 * @Singleton indica que usara patron singleton para crear esta instancia(instancia unica)
 */
@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }
}
