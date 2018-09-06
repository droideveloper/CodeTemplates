#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import dagger.Subcomponent

${SCOPE}
@Subcomponent // Provide dependencies if needed
interface ${NAME}Component: AndroidInjector<${NAME}> {
  // TODO provide shared methods or injects here
  
  @Subcomponent.Builder
  abstract class Builder: AndroidInjector.Builder<${NAME}>()
}