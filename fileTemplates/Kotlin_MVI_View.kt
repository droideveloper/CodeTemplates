#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

interface ${NAME}: View {
  fun render(model: ${MODEL})
}