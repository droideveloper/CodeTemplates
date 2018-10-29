#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.app.Activity
import android.support.v4.app.Fragment

fun Activity.appComponent(): AppComponent {
  if (application is ${APP_TYPE}) {
    return (application as ${APP_TYPE}).appComponent
  }
  throw IllegalStateException("invalid implementation of Dagger2")
}

fun Fragment.appComponent(): AppComponent {
  if (activity != null) {
    return activity.appComponent()
  }
  throw IllegalStateException("not attached any activity yet")
}