#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}: ReducerIntent<${MODEL}>() {
  
  override fun invoke(model: ${MODEL}): ${MODEL} {
    // TODO implement this
  }
}