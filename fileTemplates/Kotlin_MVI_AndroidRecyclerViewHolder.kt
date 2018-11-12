#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}(view: View): AbstractRecyclerViewHolder<${ENTITY}>(view) {
  
  override val layoutRes: Int get() = 0
  
  constructor(parent: ViewGroup): this(parent.inflate(layoutRes))
  
  override fun bind(value: ${ENTITY}) {
    // TODO implement this
  }
  
  override fun unbind() {
    // TODO implement this
  }
}