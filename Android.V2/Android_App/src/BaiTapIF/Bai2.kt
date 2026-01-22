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
fun bai3(){
    var email: String? = null
    email=readLine()!!.toString()
    val doDai= email!!.length
    println(email)
    println(doDai)
}
fun bai4(){
    var score:Int= readLine()!!.toInt()
    val output: String= if( score >= 5)  "Dau" else "Rot"
    println(output)
}
fun bai5(){
    var phone: String? = "01234566789"
    val doDai= phone!!.length
    val output: String= if( doDai >= 10 )  "So hop le" else "So khong hop le"
    println(output)

}
fun main(){
     bai1()
     bai2()
     bai3()
    bai4()
    bai5()
}
