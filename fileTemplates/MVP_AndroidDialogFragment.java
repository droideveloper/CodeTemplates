#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.os.Bundle;
import android.view.View;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;

import org.fs.core.AbstractDialogFragment;

public class ${NAME} extends AbstractDialogFragment<${NAME}Presenter> implements ${NAME}View {
  
  @Inject ${NAME}Presenter presenter;  
    
  public ${NAME}() {
    super();
    setStyle(STYLE_NO_TITLE, getTheme());
  }    
  
  @Nullable 
  @Override public View onCreateView(LayoutInflater factory, ViewGroup parent, Bundle restoreState) {
    final View view = factory.inflate(${LAYOUT_ID}, parent, false);
    // TODO: get content views
    return view;
  }
  
  @Override public void onActivityCreated(Bundle restoreState) {
    super.onActivityCreated(restoreState);
    DaggerFragmentComponent.builder()
      .fragmentModule(new FragmentModule(this))
      .build()
      .inject(this);
    presenter.restoreState(restoreState != null ? restoreState : getArguments());
    presenter.onCreate();
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    presenter.storeState(outState);
  }  
  
  @Override public void onStart() {
    super.onStart();
    presenter.onStart();
  }
  
  @Override public void onStop() {
    presenter.onStop();
    super.onStop();
  } 
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}