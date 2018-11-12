#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.os.Bundle;

import org.fs.core.AbstractActivity;

public class ${NAME} extends AbstractActivity<${NAME}Presenter> implements ${NAME}View {

  @Override public void onCreate(Bundle restoreState) {
    super.onCreate(restoreState);
    setContentView(${LAYOUT_ID});

    presenter.restoreState(restoreState != null ? restoreState : getIntent().getExtras());
    presenter.onCreate();
  } 
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }  
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}