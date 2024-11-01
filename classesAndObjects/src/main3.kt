fun main(){
//    var button1=Button("ON")
//    button1.onClick("On")
//    println("hello sam ".append("sir"))
//    var name="Asambhava"
//println(name.removeFirstAndLastChars())
    var Sambhav=Person(
        name = "Sambhav",
        age = 21,
        roll = 12220163
    )
    var Pratik=Person(
        name = "Pratik",
        age = 20,
        roll = 12222998
    )
    var Ishaan=Person(
        name="Ishaan",
        age = 21,
        roll = 12321251
    )
    var personList= mutableListOf(Sambhav,Ishaan,Pratik)
    personList.forEach { item -> println(item.name) }
}


//Data Class
data class Person(var name:String,var age:Int,var roll:Int)



////Extension functions
//fun String.append(toAppend:String): String {
//    return this.plus(toAppend)
//}
//fun String.append(toAppend:String): String = this.plus(toAppend)
//fun String.removeFirstAndLastChars():String = this.substring(1,this.length-1)



////Interfaces
//class Button(var label:String):clickEvent{
//    override fun onClick(message: String) {
//        println("Hello you are clicking ${label}")
//    }
//}
//interface clickEvent{
//    fun onClick(message : String)
//}