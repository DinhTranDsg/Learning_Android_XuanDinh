package Practice
fun baic1(){

    val age = readLine()!!.toInt()

    val output: String = if (age < 12) {
        " Trẻ em "
    } else if (age < 18) {
        " Thieu nien"
    } else {
        "nguoi lon"
    }

    println(output)
}
fun baic2(){
    var username: String?= null
    val output = username ?: "Khach"
    println(output)
}
fun baic4() {
    //    fun printLength(text: String?){
//        println(text!!.length)
//    }
    fun printLength(text: String?) {
        text?.let {
            println(it.length)
        } ?: println(0)
    }
}
fun main(){
    baic1()
    baic2()
    baic4()
}