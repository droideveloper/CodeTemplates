#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.databinding.ViewDataBinding
import org.fs.architecture.common.AbstractRecyclerViewHolder

class ${NAME}(viewDataBinding: ViewDataBinding): AbstractRecyclerViewHolder<${VIEW_MODEL}>(viewDataBinding)
