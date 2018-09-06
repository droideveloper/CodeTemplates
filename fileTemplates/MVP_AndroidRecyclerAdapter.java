#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;
import java.util.ArrayList;

public class ${NAME} extends AbstractRecyclerAdapter<${DATA_TYPE}, ${HOLDER_TYPE}> 
  implements PropertyChangedListener {
  
  public ${NAME}(ObservableList<${DATA_TYPE}> dataSet, Context context) {
    super(dataSet, context);
    dataSet.registerPropertyChangedListener(this);
  }
   
  @Override public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    super.onDetachedFromRecyclerView(recyclerView);
    dataSet.unregisterPropertyChangedListener(this);
  }
  
  @Override public ${HOLDER_TYPE} onCreateViewHolder(ViewGroup parent, int viewType) {
    return null;
  }

  @Override public void onBindViewHolder(${HOLDER_TYPE} holder, int position) {    
  }
  
  @Override public int getItemViewType(int position) {
    return 0;
  }
     
  @Override public void notifyItemsRemoved(int index, int size) {
    if(size == 1) {
      notifyItemRemoved(index);
    } else {
      notifyItemRangeRemoved(index, size);
    }
  }

  @Override public void notifyItemsInserted(int index, int size) {
    if(size == 1) {
      notifyItemInserted(index);
    } else {
      notifyItemRangeInserted(index, size);
    }
  }

  @Override public void notifyItemsChanged(int index, int size) {
    if(size == 1) {
      notifyItemChanged(index);
    } else {
      notifyItemRangeChanged(index, size);
    }
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}