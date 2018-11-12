#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.os.Bundle
import org.fs.architecture.core.AbstractActivity

class ${NAME}: AbstractActivity<${NAME}Presenter>(), ${NAME}View {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(${LAYOUT_ID})
      
    presenter.restoreState(savedInstanceState ?: intent.extras)
    presenter.onCreate()  
  }  
}