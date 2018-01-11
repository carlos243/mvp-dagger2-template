package cl.carlostapia.mvpdagger2template.application.dagger.app;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrador on 09-11-2017.
 */
@Module
public class AppContextModule {

    private Context context;

    public AppContextModule(Context context){
        this.context = context;
    }


    @AppScope
    @Provides
    Context provideAppContext(){
        return context;
    }

}
