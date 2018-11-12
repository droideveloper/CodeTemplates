#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.mvvm.managers.AbstractManager;

public final class ${NAME}Imp extends AbstractManager 
  implements ${NAME} {
  
    
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}Imp.class.getSimpleName();
  }
}