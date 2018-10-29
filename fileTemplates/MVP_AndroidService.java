#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractService;
import android.content.Intent;

public class ${NAME} extends AbstractService<${NAME}Presenter> implements ${NAME}View {
        
  @Override public int onStartCommand(Intent intent, int flags, int startId) {
    return super.onStartCommand(intent, flags, startId);
  }
  
  @Override public void onCreate() {
    super.onCreate();
    presenter.onCreate();
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}