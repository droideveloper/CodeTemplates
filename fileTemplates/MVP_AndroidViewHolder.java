#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractViewHolder;
import android.view.View;

public class ${NAME} extends AbstractViewHolder<${DATA_TYPE}> {
  
  public ${NAME}(ViewGroup parent) {
    this(LayoutInflater.from(parent.getContext()).inflater(${LAYOUT_RES}, parent, false));
  }  
    
  private ${NAME}(View view) {
    super(view);
  }
      
  public ${DATA_TYPE} getData() {
    return this.data;
  }
  
  @Override public void bind(${DATA_TYPE} entity) {
    this.entity = entity
    // TODO bind data
  }
  
  @Override public void unbind() {
    // TODO unbind data
  } 
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}