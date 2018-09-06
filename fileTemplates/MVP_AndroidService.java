#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractService;
import android.content.Intent;

public class ${NAME} extends AbstractService<${NAME}Presenter> implements ${NAME}View {
    
  @Inject ${NAME}Presenter presenter;  
    
  @Override public int onStartCommand(Intent intent, int flags, int startId) {
    return super.onStartCommand(intent, flags, startId);
  }
  
  @Override public void onCreate() {
    super.onCreate();
    DaggerServiceComponent.builder()
      .serviceModule(new ServiceModule())
      .build()
      .inject(this);
    presenter.onCreate();
  }
  
  @Override public void onDestroy() {
    super.onDestroy();
    presenter.onDestroy();
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}