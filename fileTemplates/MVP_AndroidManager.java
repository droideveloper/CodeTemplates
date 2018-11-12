#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.common.AbstractManager;

public final class ${NAME}Imp extends AbstractManager implements ${NAME} {
    
  @Override protected String getClassTag() {
    return ${NAME}Imp.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}