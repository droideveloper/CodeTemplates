#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.view.View
import org.fs.architecture.core.AbstractRecyclerViewHolder

class ${NAME}(view: View): AbstractRecyclerViewHolder<${DATA_TYPE}>(view) {
  
  override fun onBindView(entity: ${DATA_TYPE}?) {
    // TODO bind here
  }
}