#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import org.fs.mvvm.common.PagerBindingAdapter;

public final class ${NAME} extends PagerBindingAdapter<${DATA}, ${VIEW_HOLDER}> {
  
  public ${NAME}(ObsrvableList<${DATA}> dataSource) {
    super(dataSource);
  }
  
  @Override protected ${VIEW_HOLDER} createViewHolder(ViewDataBinding binding, int viewType) {
    return new ${VIEW_HOLDER}(binding);
  }
  
  @Override protected void bindViewHolder(${DATA} item, ${VIEW_HOLDER} viewHolder, int position) {
    viewHolder.setDataAndSync(BR.item, item, position);
  }  
  
  @LayoutRes 
  @Override protected int layoutResource(int viewType) {
    return ${LAYOUT_DEFAULT_SOURCE};
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