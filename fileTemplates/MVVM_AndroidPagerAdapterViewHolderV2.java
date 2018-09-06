#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.databinding.ViewDataBinding;
import org.fs.mvvm.common.AbstractPagerBindingHolder;

public final class ${NAME} extends AbstractPagerBindingHolder<${DATA}> {
  
  public ${NAME}(ViewDataBinding viewDataBinding) {
    super(viewDataBinding, viewDataBinding.getRoot());
  }
  
  @Override public boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
      
  @Override public String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }    
}