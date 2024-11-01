////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //calculate(10,20)
    //println(catAge(10))
    //println(add(5,6))
//    println(CatAge(6))
//    println(name("Sambhav"))
//    process(mutableListOf(1,2,3,4,5),2)
    enhancedMessage("Sambhav"){
        val a=24
        val b=25
        a+b
    }
}
//
//fun process(numbers:List<Int>,multiplier:Int){
//    val result= mutableListOf<Int>()
//    for(num in numbers){
//        if(num%3==2){
//            result.add(multiply(num,multiplier))
//        }
//        else{
//            result.add(5)
//        }
//    }
//    println(result)
//}
//
//
//fun multiply(a : Int,b :Int):Int{
//    return a*b
//}
//fun calculate(x:Int,y:Int){
//    for(i in x..y){
//        println(i)
//    }
//}
////we can also return values from a function
//
//fun catAge(age:Int) : Int {//return type
//    return age*7
//}
//
////Lambda function
//
//val add:(Int,Int)->Int = {a,b -> a+b}
//val CatAge:(Int)->Int={it*7} //the it keyword is directly infer as a single argumnet which is pass
////when we dont want to return any value we can use unit keyword
//val name:(String)->Unit ={println("$it")}
//
////Trailing Lambda -> According to Kotlin convention, if the last parameter of a function is a function,
//// then a lambda expression passed as the corresponding argument can be placed outside the parentheses:
//
fun enhancedMessage(name : String, funAsParameter :()->Int){
    println("$name ${funAsParameter()}")
}


//CSE224
//fun main(){
////    val numbers= listOf(1,2,3,4,5,6,7,8,9,10)
////    val result=numbers.filter { it%2!=0 }.map { it*it }.sum()
////    println("The result of the pipeline is $result")
//
////    val people= listOf(
////        mapOf("name" to "Alice","age" to  30) ,
////        mapOf("name" to "Bob","age" to  25),
////        mapOf("name" to "Charlie","age" to  35),
////        mapOf("name" to "Dave","age" to  40),
////        mapOf("name" to "Eve","age" to  28)
////    )
////    val filteredAndSorted=people.filter { it["age"] as Int>30 }.sortedByDescending { it["name"] as String }
////    println("Filtered and sorted people:")
////    filteredAndSorted.forEach{println(it)}
//
//    val numbers= listOf(1,2,3,4,5)
//    var sum=-10
//    val result=numbers.map { number->
//        val add10={x:Int->x+10}
//        val checkDivisibleBy3={x:Int->x%4==2}
//        if(checkDivisibleBy3(add10(number))){
//            sum+=number
//            sum
//        }else{
//            sum-=number
//            sum
//        }
//    }
//    println("results")
//    result.forEach(::println)
//}