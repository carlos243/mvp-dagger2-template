package cl.carlostapia.mvpdagger2template.screen.login.dagger;

import cl.carlostapia.mvpdagger2template.screen.login.core.LoginModel;
import cl.carlostapia.mvpdagger2template.screen.login.core.LoginPresenter;
import cl.carlostapia.mvpdagger2template.screen.login.core.LoginView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by CarlosTapia on 12-11-17.
 */
@Module
public class SplashModule {

    @LoginScope
    @Provides
    LoginView provideLoginView(){
        return new LoginView();
    }

    @LoginScope
    @Provides
    LoginPresenter provideLoginPresenter(){
        return new LoginPresenter();
    }

    @LoginScope
    @Provides
    LoginModel provideLoginModel(){
        return new LoginModel();
    }

}
