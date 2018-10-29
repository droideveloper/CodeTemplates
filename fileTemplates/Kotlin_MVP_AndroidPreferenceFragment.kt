#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.os.Bundle
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import org.fs.architecture.core.AbstractPreferenceFragment

class ${NAME}: AbstractPreferenceFragment<${NAME}Presenter>(): ${NAME}View {
  
  override fun onCreateView(factory: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? = factory.inflate(${LAYOUT_RES}, parent, false)
 
  ocerride fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
      
    presenter.restoreState(savedInstanceState ?: arguments)
    presenter.onCreate()  
  } 
}