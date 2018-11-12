#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}: AbstractFragment<${MODEL}, ${VIEW_MODEL}>(), ${NAME}View {
  
  override val layoutRest: Int get() = 0
  
  override fun setUp(state: Bundle?) {
    // TODO implement this
  }
  
  override fun attach() {
    // TODO implement this
  }
  
  override fun render(model: ${MODEL}) {
    // TODO implement this
  }
}