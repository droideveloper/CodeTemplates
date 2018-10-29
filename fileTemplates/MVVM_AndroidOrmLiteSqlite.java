#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.sql.SQLException;
import org.fs.mvvm.common.AbstractOrmliteHelper;
import android.content.Context;
import com.j256.ormlite.support.ConnectionSource;

public final class ${NAME}Imp extends AbstractOrmliteHelper 
  implements ${NAME} {
  
  private final static String DB_NAME = "${DB_NAME}";
  private final static int DB_VERSION = ${DB_VERSION};
  
  public ${NAME}Imp(Context context) {
    super(context, DB_NAME, DB_VERSION, ${DB_RAW_CONFIG_FILE});
  }
  
  @Override protected void createTables(ConnectionSource cs) throws SQLException {
    //TODO implement tableCreate
  }
  
  @Override protected void dropTables(ConnectionSource cs) throws SQLException {
    //TODO implement tableDrop
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}Imp.class.getSimpleName();
  }
} 