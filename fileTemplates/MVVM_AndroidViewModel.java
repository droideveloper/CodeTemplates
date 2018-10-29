#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.mvvm.data.AbstractViewModel;

public final class ${NAME}ViewModel extends AbstractViewModel<${NAME}View> {
  
  public ${NAME}ViewModel(${NAME}View view) {
    super(view);
  }
  
  @Override public void onStart() {
    //TODO implement
  }
  
  @Override public void onStop() {
    //TODO implement
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}ViewModel.class.getSimpleName();
  }
}