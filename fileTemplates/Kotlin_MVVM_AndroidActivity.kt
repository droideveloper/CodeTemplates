#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.common.AbstractActivity

class ${NAME}: AbstractActivity<${VIEW_MODEL}>(), ${NAME}View {

  override val layoutRes: Int get() = 0
  override val BRviewModel: Int get() = 0
  
  override setUp(state: Bundle?) {
    // TODO do set up
  }
  
  override fun attach() {
    // TODO attach view here
  }
  
  override fun detach() {
    // TODO detach view here
  }
}