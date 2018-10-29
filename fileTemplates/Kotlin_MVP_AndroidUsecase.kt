#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.common.UsecaseType
import io.reactivex.Observable

class ${NAME}: UsecaseType<${DATA_TYPE}> {
  
  override fun async(): Observable<${DATA_TYPE}> {
    // TODO implement usecase here
  }
}