#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.design.widget.Snackbar;
import android.view.View;
import javax.inject.Inject;
import org.fs.mvvm.injections.AbstractFragmentModule;
import org.fs.mvvm.common.AbstractFragment;
import org.fs.mvvm.utils.Objects;

public final class ${NAME} extends AbstractFragment<${NAME}ViewModel> 
  implements ${NAME}View {
  
  @Inject ${NAME}ViewModel viewModel;
  private ViewDataBinding viewDataBinding;
  
  @Nullable @Override
  public View onCreateView(LayoutInflater factory, ViewGroup parent, Bundle restoreState) {
    viewDataBinding = DataBindingUtil.inflate(factory, ${LAYOUT_ID}, parent, false);
    return viewDataBinding != null ? viewDataBinding.getRoot() : null;
  }
  
  @Override public void onActivityCreated(Bundle restoreState) {
    super.onActivityCreated(restoreState);
    DaggerFragmentComponent.builder()
      .abstractFragmentModule(new AbstractFragmentModule(this))
      .fragmentModule(new FragmentModule())
      .build()
      .inject(this);
    viewDataBinding.setVariable(BR.viewModel, viewModel);
    viewModel.restoreState(restoreState != null ? restoreState : getArguments());
    viewModel.onCreate();
  }
  
  @Override public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    viewModel.storeState(outState);
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