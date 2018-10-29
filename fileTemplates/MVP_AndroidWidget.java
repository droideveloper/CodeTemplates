#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import android.widget.${VIEW}

public class ${NAME} extends ${VIEW} {

  private OnAttachStateListener listener;
  
  public ${NAME}(Context context) {
    super(context);
  }
  
  public ${NAME}(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }
  
  public ${NAME}(Context context, @Nullable AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }  
  
  protected void log(String msg) {
    log(Log.DEBUG, msg);
  } 
  
  protected void log(Exception error) {
    StringWriter strWriter = new StringWriter(128);
    PrintWriter prtWriter = new PrintWriter(strWriter);
    error.printStackTrace(prtWriter);
    log(Log.ERROR, strWriter.toString());
  }
  
  protected void log(int lv, String msg) {
    if(isLogEnabled()) {
      Log.println(lv, getClassTag(), msg);
    }
  }
  
  protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  } 
  
  protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
}