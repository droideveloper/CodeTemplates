#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractListAdapter;
import java.util.List;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.content.Context;

public class ${NAME} extends AbstractListAdapter<${DATA_TYPE}, ${VIEW_HOLDER_TYPE}> 
  implements PropertyChangedListener {
 
  public ${NAME}(Context context, ObservableList<${DATA_TYPE}> dataSet) {
    super(context ,dataSet);
    dataSet.registerPropertyChangedListener(this);
  }
  
  @Override protected ${VIEW_HOLDER_TYPE} onCreateViewHolder(ViewGroup parent, int viewType) {
    //TODO create ViewHolder    
    return null;
  }
  
  @Override protected void onBindViewHolder(${VIEW_HOLDER_TYPE} viewHolder, int position) {
    //TODO bind ViewHolder
  }

  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override public void notifyItemsRemoved(int index, int size) {
    notifyDataSetChanged();
  }
  
  @Override public void notifyItemsInserted(int index, int size) {
    notifyDataSetChanged();
  }
  
  @Override public void notifyItemsChanged(int index, int size) {
    notifyDataSetChanged();
  }
}