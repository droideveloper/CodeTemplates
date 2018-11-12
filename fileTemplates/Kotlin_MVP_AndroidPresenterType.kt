#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import org.fs.architecture.common.PresenterType

interface ${NAME}: PresenterType