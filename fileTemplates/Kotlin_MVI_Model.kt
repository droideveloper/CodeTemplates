#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

data class ${NAME}Model(val data: ${DATA}, val state: SyncState = IDLE): Model 