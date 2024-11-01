////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
////    val input=Result.SUCCESS
////    getResult(result = input)
//    getResult(Repository.getCurrentState())
//    Repository.startFetch()
//    getResult(Repository.getCurrentState())
//    Repository.finishedFetch()
//    getResult(Repository.getCurrentState())
//    Repository.error()
//    getResult(Repository.getCurrentState())
//}
//fun getResult(result:Result){
//    when(result){
//        Result.SUCCESS -> println("Success")
//        Result.FAILURE -> println("Failure")
//        Result.ERROR -> println("ERROR")
//        Result.IDLE -> println("IDLE")
//        Result.LOADING -> println("LOADING")
//    }
//}
//object Repository{
//    private var loadState:Result=Result.IDLE
//    private var dataFetched:String?=null
//    fun startFetch(){
//        loadState=Result.LOADING
//        dataFetched="data"
//    }
//    fun finishedFetch() {
//        loadState = Result.SUCCESS
//        dataFetched = null
//    }
//    fun error(){
//        loadState=Result.ERROR
//    }
//    fun getCurrentState():Result{
//        return loadState
//    }
//}
//
//
//enum class Result{
//    SUCCESS,
//    FAILURE,
//    ERROR,
//    IDLE,
//    LOADING
//}



