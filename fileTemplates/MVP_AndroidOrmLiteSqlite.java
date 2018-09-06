#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import org.fs.core.AbstractOrmliteHelper;

public final class ${NAME}Imp extends AbstractOrmliteHelper implements ${NAME} {

  private final static String DB_NAME     = "${DATABASE_NAME}";
  private final static int    DB_VERSION  = ${DATABASE_VERSION};
  
  public ${NAME}Imp(Context context) {
    super(context, DB_NAME, DB_VERSION, R.raw.${RAW_FILE_NAME});
  }
  
  @Override protected void createTables(ConnectionSource conn) throws SQLException {
      //TODO implement createTables
  }
  
  @Override protected void dropTables(ConnectionSource conn) throws SQLException {
      //TODO implement dropTables   
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}Imp.class.getSimpleName();
  }    
}
