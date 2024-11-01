//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val list= mutableListOf("Sam","Ishan","Pratik")
    val listNumbers= mutableListOf(12,40,25)
    val finder=Finder(listNumbers)
    finder.findItem(12){
        println("found $it")
    }
}

//Generics can be used to avoid duplication of code for different datatypes
// now in this function we can pass any list of any type
class Finder<T>(private var list:List<T>){
    fun findItem(element:T,foundItem:(element:T?)->Unit){
        val itemList=list.filter {
            it==element
        }
        if(itemList.isNullOrEmpty()){
            foundItem(null)
        }else{
            foundItem(itemList.first())
        }
    }
}




//class Finder(private var list:List<String>){
//    fun findItem(element:String,foundItem:(element:String?)->Unit){
//        val itemList=list.filter {
//            it==element
//        }
//        if(itemList.isNullOrEmpty()){
//            foundItem(null)
//        }else{
//            foundItem(itemList.first())
//        }
//    }
//}