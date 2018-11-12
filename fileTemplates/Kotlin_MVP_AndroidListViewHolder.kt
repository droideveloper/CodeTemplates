#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.view.View
import org.fs.architecture.core.AbstractViewHolder

class ${NAME}(view: View): AbstractViewHolder<${DATA_TYPE}>(view) {
  
  override fun onBindView(entity: ${DATA_TYPE}?) {
    // TODO bind here
  }
}