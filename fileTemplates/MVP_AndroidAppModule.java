#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import dagger.Module;

@Module
public abstract class ${NAME} {
  
  @Binds @Singleton public abstract Application bindApplication(${APP_NAME} app);
  @Binds @Singleton public abstract Context bindContext(Application app);

}