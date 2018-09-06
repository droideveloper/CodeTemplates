#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.view.View;
import org.fs.core.AbstractRecyclerViewHolder;

public class ${NAME} extends AbstractRecyclerViewHolder<${DATA}> {

  private ${DATA} data;

  public ${NAME}(View view) {
    super(view);
  }

  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }

  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }

  @Override public final void onBindView(${DATA} data) {
      //TODO bind data in view
  }
}