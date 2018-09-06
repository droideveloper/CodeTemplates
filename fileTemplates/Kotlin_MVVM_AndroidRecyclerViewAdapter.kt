#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}Adapter @Inject constructor(
  private val dataSet: ObservableList<${VIEW_MODEL}>): AbstractRecyclerViewAdapter<${VIEW_MODEL}, ${VIEW_HOLDER}>(dataSet) {

  override fun onCreateViewHolder(viewDataBinding: ViewDataBinding, viewType: Int): ${VIEW_HOLDER} {
    // TODO implement here
  }

  override fun layoutRes(viewType: Int): Int = 0
  override fun bindingRes(): Int = 0
    
}