#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}Adapter @Inject constructor(dataSet: ObservableList<${ENTITY}>): AbstractRecyclerViewAdapter<${ENTITY}, ${VIEW_HOLDER}>(dataSet) {

  override fun onCreateView(parent: ViewGroup, viewType: ViewType): ${VIEW_HOLDER} {
    // TODO implement this
  }
  
  override fun getItemViewType(position: Int): Int = super.getItemViewType(position) // TODO implement this if you need more than one adapter
} 