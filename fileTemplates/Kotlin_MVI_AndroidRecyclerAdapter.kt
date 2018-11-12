#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

@${SCOPE}
class ${NAME} @Inject constructor(dataSet: ObservableList<${ENTITY}>): AbstractRecyclerViewAdapter<${ENTITY}, ${VIEW_HOLDER}>(dataSet) {

  override fun onCreateView(parent: ViewGroup, viewType: ViewType): ${VIEW_HOLDER} = ${VIEW_HOLDER}(parent)
} 