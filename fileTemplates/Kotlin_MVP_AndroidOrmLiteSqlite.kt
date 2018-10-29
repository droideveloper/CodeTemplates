#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.SQLException
import com.j256.ormlite.support.ConnectionSource
import org.fs.architecture.core.AbstractOrmliteHelper

class ${NAME}(context: Context): AbstractOrmliteHelper(context, "${DATABASE_NAME}", ${DATABASE_VERSION}, ${RAW_FILE_NAME}), ${INTERFACE_NAME} {

  override fun createTables(connectionSource: ConnectionSource?) {
    // TODO create
  }

  override fun dropTables(connectionSource: ConnectionSource?) {
    // TODO drop
  }
}