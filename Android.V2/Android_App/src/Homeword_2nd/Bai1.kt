package Homeword_2nd
fun main(){
    val age: Int = readLine()!!.toInt()

    val output: String = if (age >= 18) " Da du tuoi" else "chua du tuoi"
    println(output)
}
