#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.os.Parcelable

@Parcelize data class ${NAME}(): Parcelable 