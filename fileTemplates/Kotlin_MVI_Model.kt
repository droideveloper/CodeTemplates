#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

data class ${MODEL}Model(val data: ${DATA}, val state: SyncState = IDLE): Model 