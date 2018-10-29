#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.databinding.ObservableList;
import org.fs.mvvm.common.AbstractPagerBindingAdapter;

public final class ${NAME} extends AbstractPagerBindingAdapter<${DATA_TYPE}> {

  public ${NAME}(FragmentManager fragmentManager, ObservableList<${DATA_TYPE}> itemSource) {
    super(fragmentManager, itemSource);
  }
  
  @Override protected Fragment onBindView(${DATA_TYPE} item, int viewType) {
    //TODO return fragment
    return null;
  }
  
  @Override protected int getItemViewType(int position) {
    return 0;
  }

  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}