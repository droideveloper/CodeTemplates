#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.common.AbstractPresenter

@${SCOPE}
class ${NAME} @Inject constructor(view: ${NAME}View): AbstractPresenter<${NAME}View>(view), ${NAME}Presenter {
  
  override fun onStart() {
    //TODO implement
  }

  override fun onStop() {
    //TODO implement
  }
}  