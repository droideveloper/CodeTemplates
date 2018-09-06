#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.databinding.ViewDataBinding;

import org.fs.mvvm.common.AbstractRecyclerBindingHolder;

public final class ${NAME} extends AbstractRecyclerBindingHolder<${DATA_TYPE}> {
  
  public ${NAME}(ViewDataBinding viewDataBinding, Observer<SelectedEventType<${DATA_TYPE}>> observer) {
    super(viewDataBinding, observer);
  }
}