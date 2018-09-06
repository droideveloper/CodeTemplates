#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.common.AbstractPresenter;

public class ${NAME}PresenterImp extends AbstractPresenter<${NAME}View> implements ${NAME}Presenter {
    
  public ${NAME}PresenterImp(${NAME}View view) {
    super(view);
  }
  
  @Override public void onStart() {
    //TODO implement
  }

  @Override public void onStop() {
    //TODO implement
  }
  
  @Override protected String getClassTag() {
    return ${NAME}PresenterImp.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }    
}