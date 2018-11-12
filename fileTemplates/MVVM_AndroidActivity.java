#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;
import javax.inject.Inject;
import org.fs.mvvm.common.AbstractActivity;
import org.fs.mvvm.injections.AbstractActivityModule;
import org.fs.mvvm.utils.Objects;

public final class ${NAME} extends AbstractActivity<${NAME}ViewModel>
  implements ${NAME}View {
  
  @Inject ${NAME}ViewModel viewModel;
  @Inject ViewDataBinding viewDataBinding;
  
  @Override public void onCreate(Bundle restoreState) {
    super.onCreate(restoreState);
    //inject it this way
    DaggerActivityComponent.builder()
      .activityModule(new ActivityModule())
      .abstractActivityModule(new AbstractActivityModule(this, ${LAYOUT_ID}))//this is abstract layer, extend AbstractActivityModule
      .build()
      .inject(this);
    viewDataBinding.setVariable(BR.viewModel, viewModel);    
    viewModel.restoreState(restoreState != null ? restoreState : getIntent().getExtras());
    viewModel.onCreate();
  }
  
  @Override public void onSaveInstanceState(Bundle storeState) {
    super.onSaveInstanceState(storeState);
    viewModel.storeState(storeState);
  }
  
  @Override public void onStart() {
    super.onStart();
    viewModel.onStart();
  }
  
  @Override public void onStop() {
    viewModel.onStop();
    super.onStop();
  }  
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }  
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}