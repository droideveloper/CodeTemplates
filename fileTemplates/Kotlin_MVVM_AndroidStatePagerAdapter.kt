#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}StatePagerAdapter @Inject constructor(
  fragmentManager: FragmentManager, dataSet: ObservableList<${VIEW_MODEL}>): AbstractStatePagerAdapter(fragmentManager, dataSet) {

  override fun viewTypeAt(position: Int): Int = 0

  override fun createFragment(viewType: Int, item: ${VIEW_MODEL}): Fragment {
    // TODO implement this
  }
}