#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import org.fs.mvvm.managers.BusManager;

import org.fs.mvvm.common.AbstractRecyclerBindingAdapter;

public final class ${NAME} extends AbstractRecyclerBindingAdapter<${DATA_TYPE}, ${VIEW_HOLDER_TYPE}> {

  public static ${NAME} createSingleMode(Context context, ObservableList<${DATA_TYPE}> itemSource) {
    return new ${NAME}(context, itemSource, SINGLE_SELECTION_MODE);
  }
  
  public static ${NAME} createMultipleMode(Context context, ObservableList<${DATA_TYPE}> itemSource) {
    return new ${NAME}(context, itemSource, MULTIPLE_SELECTION_MODE);
  }

  private ${NAME}(Context context, ObservableList<${DATA_TYPE}> itemSource, int selectionMode) {
    super(context, itemSource, selectionMode);
  }  
  
  @Override protected void bindDataViewHolder(${DATA_TYPE} item, ${VIEW_HOLDER_TYPE} viewHolder) {
    viewHolder.setItem(${BR_ITEM_NAME}, item);
  }
  
  @Override protected ${VIEW_HOLDER_TYPE} createDataViewHolder(ViewDataBinding viewDataBinding, Observer<SelectedEventType<${DATA_TYPE}>> observer, int viewType) {
    return new ${VIEW_HOLDER_TYPE}(viewDataBinding, observer);
  }
  
  @LayoutRes
  @Override protected int layoutResource(int viewType) {
    return ${LAYOUT_ID};
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }

  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}