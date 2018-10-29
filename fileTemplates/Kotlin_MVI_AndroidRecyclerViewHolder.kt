#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}ViewHolder(view: View): AbstractRecyclerViewHolder<${ENTITY}>(view) {
  
  override protected val layoutRes: Int get() = 0
  
  constructor(parent: ViewGroup): this(parent.inflate(layoutRes))
  
  override fun bind(value: ${ENTITY}) {
    // TODO implement this
  }
  
  override fun unbind() {
    // TODO implement this
  }
}