#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractPreferenceActivity;

public class ${NAME} extends AbstractPreferenceActivity<${NAME}Presenter> implements ${NAME}View {

  @Inject ${NAME}Presenter presenter;

  @Override public void onCreate(Bundle restoreState) {
    super.onCreate(restoreState);
    //inject it this way
    DaggerActivityComponent.builder()
      .activityModule(new ActivityModule())
      .build()
      .inject(this);
    presenter.onCreate();
    presenter.restoreState(restoreState != null ? restoreState : getIntent().getExtra());
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
  
  @Override public void onDestroy() {
    presenter.onDestroy();
    super.onDestroy();
  }

  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}