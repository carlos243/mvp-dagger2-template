package cl.carlostapia.mvpdagger2template.screens.login.dagger;

import android.content.Context;

import cl.carlostapia.mvpdagger2template.screens.login.LoginActivity;
import cl.carlostapia.mvpdagger2template.screens.login.core.LoginModel;
import cl.carlostapia.mvpdagger2template.screens.login.core.LoginPresenter;
import cl.carlostapia.mvpdagger2template.screens.login.core.LoginView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by CarlosTapia on 12-11-17.
 */
@Module
public class LoginModule {

    @LoginScope
    @Provides
    LoginView provideLoginView(LoginActivity loginActivity){
        return new LoginView(loginActivity);
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
