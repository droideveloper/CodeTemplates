#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}ViewModel @Inject constructor(view: ${NAME}View): AbstractViewModel<${NAME}View>(view) {

  override var showProgress: Boolean = false
  override var errorMessage: String = String.EMPTY

  override fun attach() {
    // TODO implement this
  }

  override fun detach() {
    // TODO implement thisz
  }
}