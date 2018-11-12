#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.os.Bundle
import org.fs.architecture.core.AbstractPreferenceActivity

class ${NAME}: AbstractPreferenceActivity<${NAME}Presenter>(), ${NAME}View {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(${LAYOUT_ID})
      
    presenter.restoreState(savedInstanceState ?: intent.extras)
    presenter.onCreate()  
  }  
}