#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}: AbstractFragment<${VIEW_MODEL}>(), ${NAME}View {
  
  override protected val layoutRest: Int get() = 0
  
  override fun setUp(state: Bundle?) {
    // TODO implement this
  }
  
  override fun attach() {
    // TODO implement this
  }
  
  override fun detach() {
    // TODO implement this
  }
}