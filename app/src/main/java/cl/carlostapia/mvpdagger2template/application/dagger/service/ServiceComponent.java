package cl.carlostapia.mvpdagger2template.application.dagger.service;

import javax.inject.Singleton;

import cl.carlostapia.mvpdagger2template.application.dagger.app.AppModule;
import dagger.Component;

/**
 * Created by CarlosTapia on 12-11-17.
 */
@Singleton
@Component(modules = {AppModule.class, ServiceModule.class})
public interface ServiceComponent {
}
