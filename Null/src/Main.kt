//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val text:String? = null
    //? helps to check if it contains null or not
    println(text?.length)

    val text2=text?:"The variable is null."
    println(text2)
}