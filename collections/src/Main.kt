//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//
//    //list
//    var myList= mutableListOf(1,4,5,6)
//    myList.add(4)
//    println(myList)
//
//    //set -> unlike list it can only store unique elements
//    var mySet= mutableSetOf(1,3,4,5)
//    mySet.add(4)
//    println(mySet)
//
//    //Map
//    var myMap= mutableMapOf("one" to 1,"two" to 2,"three" to 3)
//    println(myMap)
//    println(myMap.keys)
//    println(myMap.values)

    //filter -> it helps to filter out the elements and its lambda function returns boolean value
                // so it selects accordingly
    var list= mutableListOf("rafael","wallah","maya","sam")
    var found=list.filter {
       // it=="sam"
        //it.startsWith("r")
       // it.endsWith("M", ignoreCase = true)
        it.length==6
    }
    println(found)
}