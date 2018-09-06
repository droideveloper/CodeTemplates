#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractBroadcastReceiver;
import android.content.Intent;
import android.content.Context;

public class ${NAME} extends AbstractBroadcastReceiver<${NAME}Presenter> implements ${NAME}View {
       
  @Inject ${NAME}Presenter presenter;      
       
  public ${NAME}() {
    super();
    DaggerBroadcastComponent.builder()
      .broadcastModule(new BroadcastModule(this))
      .build()
      .inject(this);
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