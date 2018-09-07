#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

class ${NAME}ObservableIntent: ObservableIntent<${MODEL}>() {
  
  private fun task(): Observable<${ENTITY}> {
    // TODO implement this
  }
  
  override fun invoke(): Obervable<Reducer<${MODEL}>> = Observable.create { emitter -> 
    emitter.onNext { o -> o.copy(state = ${TASK_STATE})}
    emitter.setDisposable(task()
      .subscribeOn(Schedulers.io())
      .subscribe(
      { data ->
        emitter.onNext { o -> o.copy(data = data, state = IDLE) }
      },
      { error ->
        emitter.onNext { o -> o.copy(state = ERROR(error)) }
        emitter.onNext { o -> o.copy(state = IDLE) }
      }
      )) 
  }
}