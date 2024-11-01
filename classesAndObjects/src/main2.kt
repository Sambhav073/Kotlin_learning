//fun main(){
//    val car=Car()
//    println(car.color)
//    println(car.model)
//    car.drive()
//    car.color="blue"
//    println(car.color)
//}
//class Car{
//    var color="red"
//    var model="xmd"
//    fun drive(){
//        println("yeah we are moving")
//    }
//}


fun main(){
//    var firstCar=Car("green","llm")
//    var seconCar=Car("Black","i20")
//    println("First car colour is ${firstCar.color} and model is ${firstCar.model}")
//    println("Second Car colour is ${seconCar.color} and model is ${seconCar.model}")
//    firstCar.drive()
//    firstCar.speed(100,200)
    var truck1=Truck()
    truck1.drive()
    println(truck1.model)
    truck1.speed(50,40)
}
open class Car(var color:String="red",var model:String="mmd"){
    open fun drive(){
        println("yeah we are moving")
    }
    open fun speed( min:Int=20, max:Int=20){
        println("cars min speed is $min and max speed is $max")
    }
}
class Truck(color: String = "red", model: String = "mmd"): Car(color, model){
    override fun drive() {
        println("We are driving a truck")
    }
}