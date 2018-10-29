#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}Navigation: Navigation<${ENTITY}> {

  override fun navigate(context: Context, value: ${ENTITY}) {
    // TODO implement this
  }
}