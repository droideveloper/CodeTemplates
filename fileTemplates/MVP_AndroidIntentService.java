#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractIntentService;
import android.content.Intent;

public class ${NAME} extends AbstractIntentService<${NAME}Presenter> implements ${NAME}View {

  @Inject ${NAME}Presenter presenter;

  public ${NAME}(String strName) {
    super(strName);
    DaggerIntentServiceComponent.builder()
      .intentServiceModule(new IntentServiceModule(this))
      .build()
      .inject(this);  
  }
  
  @Override public void onHandleIntent(Intent intent) { }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}