#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import ${PACKAGE_NAME}.BuildConfig;

public class ${NAME} extends DaggerApplication {

  
}