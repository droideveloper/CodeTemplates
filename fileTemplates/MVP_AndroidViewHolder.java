#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractViewHolder;
import android.view.View;

public class ${NAME} extends AbstractViewHolder<${DATA_TYPE}> {
    
  public ${NAME}(View view) {
    super(view);
  }
      
  public ${DATA_TYPE} getData() {
    return this.data;
  }
  
  @Override public final void onBindView(${DATA_TYPE} data) {
      //TODO bind data
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}