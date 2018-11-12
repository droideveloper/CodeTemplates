#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.mvvm.data.ConverterType;
import org.fs.mvvm.managers.AbstractManager;
import java.util.Locale;

public final class ${NAME} extends AbstractManager 
  implements ConverterType<${PARAMETER_TYPE}, ${RETURN_TYPE}> {

  @Override public ${RETURN_TYPE} convert(${PARAMATER_TYPE} object, Locale locale) {
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