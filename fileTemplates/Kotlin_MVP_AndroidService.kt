#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.core.AbstractService
import android.content.Intent
import android.os.IBinder

class ${NAME}: AbstractService<${NAME}Presenter>(), ${NAME}View {
  
  override fun onBind(intent: Intent?): IBinder? = null

  override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int = super.onStartCommand(intent, flags, startId)
  
  override fun onCreate() {
    super.onCreate()
    presenter.onCreate()  
  }
}