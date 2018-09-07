#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}ViewModelImp(view: ${NAME}View): AbstractViewModel<${NAME}View>(view), ${NAME}ViewModel {
  
  override fun attach() {
    if(view.isAvailable()) {
      // TODO implement here
    }
  }
  
  override fun detach() {
    // TODO implement here
  }
} 