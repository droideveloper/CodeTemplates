#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class ${NAME} implements UsecaseType<${DATA_TYPE}> {    
  
  @Override public Observable<${DATA_TYPE}> async() {
    // TODO implement this
    return null;
  }
  
  protected void log(String msg) {
    log(Log.DEBUG, msg);
  }
  
  protected void log(Throwable exp) {
    StringWriter strWriter = new StringWriter(128);
    PrintWriter  ptrWriter = new PrintWriter(strWriter);
    exp.printStackTrace(ptrWriter);
    log(Log.ERROR, strWriter.toString());
  }
  
  protected void log(int lv, String msg) {
    if(isLogEnabled()) {
      Log.println(lv, getClassTag(), msg);
    }
  }
  
  protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
}