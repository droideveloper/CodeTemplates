#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.common.AbstractPresenter;

@${SCOPE}
public class ${NAME}PresenterImp extends AbstractPresenter<${NAME}View> implements ${NAME}Presenter {
  
  private final CompositeDisposable disposeBag = new CompositeDisposable();
    
  @Inject public ${NAME}PresenterImp(${NAME}View view) {
    super(view);
  }
  
  @Override public void onCreate() {
    if(view.isAvailable()) {
      // TODO implement
    }
  } 
  
  @Override public void onStart() {
    // TODO implement
  }

  @Override public void onStop() {
    disposeBag.clear();
  }
  
  @Override protected String getClassTag() {
    return ${NAME}PresenterImp.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }    
}