#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

class ${NAME}: ObservableIntent<${MODEL}>() {
  
  override fun invoke(): Obervable<Reducer<${MODEL}>> = Observable.create { emitter -> 
    emitter.onNext { o -> o.copy(state = Idle)} // TODO change this
    emitter.setDisposable(task()
      .subscribeOn(Schedulers.io())
      .subscribe(
        { data ->
          emitter.onNext { o -> o.copy(data = data, state = Idle) }
        },
        { error ->
          emitter.onNext { o -> o.copy(state = Failure(error)) }
          emitter.onNext { o -> o.copy(state = Idle) }
        })) 
  }
}