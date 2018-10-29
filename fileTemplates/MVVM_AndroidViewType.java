#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.mvvm.data.ViewType;

public interface ${NAME}View extends ViewType {
  
}