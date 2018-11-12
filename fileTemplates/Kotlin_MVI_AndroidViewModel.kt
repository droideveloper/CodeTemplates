#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

@${SCOPE}
class ${NAME} @Inject constructor(view: ${VIEW}): AbstractViewModel<${MODEL}, ${VIEW}>(view) {
  
  override fun initState(): ${MODEL} = throw NotImplementedError("not implemented")
  
  override fun toIntent(event: Event): Intent = when(event) {
    else -> NothingIntent<${MODEL}>() // if we can not resolve event to intent
  }
  
} 