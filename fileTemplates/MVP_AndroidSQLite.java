#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import org.fs.core.AbstractSQLite;

public class ${NAME} extends AbstractSQLite {

  private final static String DB_NAME    = "${DATABASE_NAME}";
  private final static int    DB_VERSION = 1;    

  public ${NAME}(Context context) {
    super(context, DB_NAME, null, DB_VERSION);
  }

  @Override public void onCreate(SQLiteDatabase db) {
      //TODO implement create, like create table queries
  }

  @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     //TODO implement update, wipe tables then call #onCreate(SQLiteDatabase db);       
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}   