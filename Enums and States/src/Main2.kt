import java.io.IO
import java.io.IOException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val input=Result.SUCCESS
//    getResult(result = input)
    getResult(Repository.getCurrentState())
    Repository.startFetch()
    getResult(Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(Repository.getCurrentState())
    Repository.error()
    getResult(Repository.getCurrentState())
    Repository.customFailure()
    getResult(Repository.getCurrentState())
    Repository.anotherFailure()
    getResult(Repository.getCurrentState())
}
fun getResult(result:Result){
    when(result){
        is ERROR->{
            println(result.Exception.toString())
        }
        is Success->{
            println(result.dataFetched?:"Ensure you start the fetch function first")
        }
        is Loading->{
            println("Loading...")
        }
        is NotLoading->{
            println("Idle")
        }
//        else->println("N/A")
        is Failure.AnotherFailure -> println(result.anotherFailure.toString())
        is Failure.CustomFailure -> println(result.customFailure.toString())
    }
}
object Repository{
    private var loadState:Result=NotLoading
    private var dataFetched:String?=null
    fun startFetch(){
        loadState=Loading
        dataFetched="data"
    }
    fun finishedFetch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }
    fun error(){
        loadState=ERROR(Exception("exception"))
    }
    fun getCurrentState():Result{
        return loadState
    }
    fun customFailure(){
        loadState=Failure.CustomFailure(IOException("something went wrong"))
    }
    fun anotherFailure(){
        loadState=Failure.AnotherFailure(java.lang.NullPointerException("null found"))
    }
}

//abstract class Result
sealed class Result

data class Success(val dataFetched:String?):Result()
data class ERROR(val Exception:Exception):Result()
object NotLoading:Result()
object Loading:Result()

sealed class Failure:Result(){
    data class CustomFailure(val customFailure: IOException):Failure()
    data class AnotherFailure(val anotherFailure: NullPointerException):Failure()
}