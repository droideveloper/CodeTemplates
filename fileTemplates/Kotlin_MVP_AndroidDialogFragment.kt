#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.os.Bundle
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import org.fs.architecture.core.AbstractDialogFragment

class ${NAME}(): AbstractDialogFragment<${NAME}Presenter>(), ${NAME}View {

  init {
    setStyle(STYLE_NO_TITLE, theme)
  }

  override fun onCreateView(factory: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? = factory.inflate(${LAYOUT_ID}, parent, false)
   
  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
      
    presenter.restoreState(savedInstanceState ?: arguments)
    presenter.onCreate()  
  } 

}