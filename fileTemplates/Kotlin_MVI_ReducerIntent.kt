#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}ReducerIntent: ReducerIntent<${MODEL}>() {
  
  override fun invoke(o: ${MODEL}): ${MODEL} {
    // TODO implement this
  }
}