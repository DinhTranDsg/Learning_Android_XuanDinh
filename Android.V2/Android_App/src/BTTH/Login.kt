package BTTH
enum class LoginStatus {
    LOGIN_EMPTY,
    LOGIN_SUCCESS,
    LOGIN_ERROR
}
data class Account(val username: String?, val password: String?)
data class UserAcount(val username: String?, val password: String?)

fun loginTraditional(account: UserAcount?): LoginStatus {

    if (account == null || account.username.isNullOrEmpty() || account.password.isNullOrEmpty()) {
        return LoginStatus.LOGIN_EMPTY
    }

    return if (account.username == "admin" && account.password == "123") {
        LoginStatus.LOGIN_SUCCESS
    }
    else {
        LoginStatus.LOGIN_ERROR
    }
}

fun login(account: UserAcount?, onResult: (LoginStatus) -> Unit) {
    val result = account?.let { acc ->
        val user = acc.username
        val pass = acc.password

        when {
            user.isNullOrEmpty() || pass.isNullOrEmpty() -> LoginStatus.LOGIN_EMPTY
            user == "admin" && pass == "123" -> LoginStatus.LOGIN_SUCCESS
            else -> LoginStatus.LOGIN_ERROR
        }
    } ?: LoginStatus.LOGIN_EMPTY

    onResult(result)
}

fun main() {
   println("Nhap tai khoan cua ban")
    val name: String? = readlnOrNull()
    println("Nhap mat khau cua ban")
    val pass: String? = readlnOrNull()
        val userAcc = UserAcount(name, pass)
        login(userAcc) {status ->
            when (status) {
                LoginStatus.LOGIN_SUCCESS->println("Đăng nhập thành công $name")
                LoginStatus.LOGIN_EMPTY->println(" Không được để trống tài khoản or mật khẩu")
                LoginStatus.LOGIN_ERROR->println("Tài khoản or mật khẩu không chính xác")
            }
        }
    }
