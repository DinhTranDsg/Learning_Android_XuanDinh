package BaiTapIF

fun bai1(){
    var name: String? = "An"
    val doDai= name?.length
    println(doDai)
}
fun bai2(){
    var name: String? = "An"
    val doDai= name!!.length
    println(doDai)
}
fun main(){
     bai1()
     bai2()
}
