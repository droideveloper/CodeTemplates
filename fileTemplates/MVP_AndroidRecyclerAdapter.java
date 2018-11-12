#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;
import java.util.ArrayList;

@${SCOPE}
public class ${NAME} extends AbstractRecyclerAdapter<${DATA_TYPE}, ${HOLDER_TYPE}> {
  
  @Inject public ${NAME}(ObservableList<${DATA_TYPE}> dataSet) {
    super(dataSet);
  }
   
  @Override public ${HOLDER_TYPE} onCreateViewHolder(ViewGroup parent, int viewType) {
    return null;
  }
  
  @Override public int getItemViewType(int position) {
    return super.getItemViewType(position);
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}