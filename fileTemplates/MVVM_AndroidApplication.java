#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

public final class ${NAME} extends Application {
  
  @Override public void onCreate() {
    super.onCreate();
  }
}