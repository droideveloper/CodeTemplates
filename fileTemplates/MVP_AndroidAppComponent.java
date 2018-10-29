#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import dagger.Component;

@Singleton
@Component(modules = { AndroidSupportInjectionModule.class, AppModule.class, ProviderAppModule.class })
public interface ${NAME} extends AndroidInjector<${APP_NAME}> {

  @Component.Builder
  abstract class Builder extends AndroidInjector.Builder<${APP_NAME}> { }
}