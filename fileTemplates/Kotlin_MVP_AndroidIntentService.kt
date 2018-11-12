#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.core.AbstractIntentService
import android.content.Intent

class ${NAME}(named: String): AbstractIntentService<${NAME}Presenter>(named), ${NAME}View {
  
  init {

  }
  
  override fun onHandleIntent(intent: Intent) {
    // TODO do work
  }
}