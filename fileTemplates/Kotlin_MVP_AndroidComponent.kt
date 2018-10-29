#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import dagger.Component

${SCOPE}
@Component // Provide dependencies if needed
interface ${NAME}Component: AndroidInjector<${NAME}> {
  // TODO provide shared methods or injects here
  
  @Component.Builder
  abstract class Builder: AndroidInjector.Builder<${NAME}>()
}