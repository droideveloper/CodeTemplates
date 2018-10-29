#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.core.AbstractBroadcastReceiver
import android.content.Intent
import android.content.Context

class ${NAME}(): AbstractBroadcastReceiver<${NAME}Presenter>(), ${NAME}View {

  init {

  }
  
  override fun onReceive(context: Context, intent: Intent) {
    // TODO implement here
  }
  
}