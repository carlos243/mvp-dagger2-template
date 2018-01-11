package cl.carlostapia.mvpdagger2template.screens.login.dagger;

import javax.inject.Singleton;

import cl.carlostapia.mvpdagger2template.application.dagger.app.AppModule;
import cl.carlostapia.mvpdagger2template.screens.login.LoginActivity;
import dagger.Component;

/**
 * Created by CarlosTapia on 12-11-17.
 */
@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
