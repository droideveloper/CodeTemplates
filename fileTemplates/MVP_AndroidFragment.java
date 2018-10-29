#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.view.View;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import org.fs.core.AbstractFragment;

public class ${NAME} extends AbstractFragment<${NAME}Presenter> implements ${NAME}View {
  
  @Nullable @Override
  public View onCreateView(LayoutInflater factory, ViewGroup parent, Bundle restoreState) {
    final View view = factory.inflate(${LAYOUT_ID}, parent, false);
    // TODO implement
    return view;
  }
  
  @Override public void onActivityCreated(Bundle restoreState) {
    super.onActivityCreated(restoreState);

    presenter.restoreState(restoreState != null ? restoreState : getArguments());
    presenter.onCreate();
  }
    
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }  
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}