#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.core.AbstractRecyclerViewAdapter
import android.view.ViewGroup

class ${NAME}(dataSet: ObservableList<${DATA_TYPE}>): AbstractRecyclerViewAdapter<${DATA_TYPE}, ${VIEW_HOLDER}>(dataSet) {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${VIEW_HOLDER} {
    // TODO return ViewHolders
  }
} 