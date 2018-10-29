#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractBroadcastReceiver;
import android.content.Intent;
import android.content.Context;

public class ${NAME} extends AbstractBroadcastReceiver<${NAME}Presenter> implements ${NAME}View {
              
  public ${NAME}() {
    super();
  }
  
  @Override public void onReceive(Context context, Intent intent) {
      //TODO implement recieve
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}