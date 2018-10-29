#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractPreferenceActivity;

public class ${NAME} extends AbstractPreferenceActivity<${NAME}Presenter> implements ${NAME}View {

  @Override public void onCreate(Bundle restoreState) {
    super.onCreate(restoreState);

    presenter.onCreate();
    presenter.restoreState(restoreState != null ? restoreState : getIntent().getExtra());
  }

  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}