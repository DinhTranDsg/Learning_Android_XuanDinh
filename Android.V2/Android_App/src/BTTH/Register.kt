package BTTH

enum class RegisterStatus {
    INVALID_INPUT,
    PASSWORD_NOT_MATCH,
    EMAIL_EXIST,
    SUCCESS
}

data class RegisterInput(val email: String?, val password: String?, val comfirmPassword: String?)

fun register(input: RegisterInput, existEmails: List<String>): RegisterStatus {

    if (input.email.isNullOrEmpty() || input.password.isNullOrEmpty() || input.comfirmPassword.isNullOrEmpty()) {
        return RegisterStatus.INVALID_INPUT
    }

    if (input.password != input.comfirmPassword) {
        return RegisterStatus.PASSWORD_NOT_MATCH
    }

    if (existEmails.contains(input.email)) {
        return RegisterStatus.EMAIL_EXIST
    }

    return RegisterStatus.SUCCESS
}
fun main(){
    val existEmails = listOf("a@gmail.com", "b@gmail.com")
    println("Nhap email cua ban")
    val email: String = readLine().toString()
    println("Nhap mat khau cua ban")
    val password: String = readLine().toString()
    println("Nhap mat khau cua ban")
    val confirmPassword: String = readLine().toString()
    val input = RegisterInput(email, password, confirmPassword)
    val ktra = register(input, existEmails)
    when(ktra){
        RegisterStatus.INVALID_INPUT -> println("Thong tin khong duoc de trong!")
        RegisterStatus.PASSWORD_NOT_MATCH -> println(" Mat khau xac nhan khong dung!")
        RegisterStatus.EMAIL_EXIST -> println("Email nay da ton tai!")
        RegisterStatus.SUCCESS -> println("Dang ky tai khoan thanh cong.")

}
}