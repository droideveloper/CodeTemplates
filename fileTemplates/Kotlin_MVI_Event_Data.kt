#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

data class ${NAME}Event(): Event