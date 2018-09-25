#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.view.View;
import org.fs.core.AbstractRecyclerViewHolder;

public class ${NAME} extends AbstractRecyclerViewHolder<${DATA}> {

  public ${NAME}(ViewGroup parent) {
    this(LayoutInflater.from(parent.getContext()).inflater(${LAYOUT_RES}, parent, false));
  }

  private ${NAME}(View view) {
    super(view);
  }

  @Override public final void bind(${DATA} entity) {
    this.entity = entity;
    // TODO bind data in view
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