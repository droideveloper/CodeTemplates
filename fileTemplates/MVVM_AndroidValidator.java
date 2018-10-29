#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.mvvm.data.IValidator;
import org.fs.mvvm.managers.AbstractManager;
import java.util.Locale;
import org.fs.mvvm.data.Validation;

public final class ${NAME} extends AbstractManager 
  implements ValidatorType<${PARAMETER_TYPE}> {

  @Override public Validation validate(${PARAMETER_TYPE} object, Locale locale) {
    //TODO implement
    return null;
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}