#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.os.Bundle;

import org.fs.core.AbstractActivity;

public class ${NAME} extends AbstractActivity<${NAME}Presenter> implements ${NAME}View {

  @Inject ${NAME}Presenter presenter;

  @Override public void onCreate(Bundle restoreState) {
    super.onCreate(restoreState);
    setContentView(${LAYOUT_ID});
    //inject it this way
    DaggerActivityComponent.builder()
      .activityModule(new ActivityModule(this))
      .build()
      .inject(this);
    presenter.restoreState(restoreState != null ? restoreState : getIntent().getExtras());
    presenter.onCreate();
  }
    
  @Override public void onSaveInstanceState(Bundle storeState) {
    super.onSaveInstanceState(storeState);
    presenter.storeState(storeState);
  }
  
  @Override public void onStart() {
    super.onStart();
    presenter.onStart();
  }
  
  @Override public void onStop() {
    presenter.onStop();
    super.onStop();
  }  
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }  
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}