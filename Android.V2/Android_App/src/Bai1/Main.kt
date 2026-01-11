package Bai1

data class BankAccount private constructor(
    val balance: Int
){
    companion object {
        fun create(initialBalance : Int) :BankAccount{
            return BankAccount(initialBalance)
        }
    }
    fun deposit(amount: Int) : BankAccount {
        require(amount > 0 ) { "Depotsit amount > 0)" }
        return BankAccount(balance+amount)
    }
    fun withdraw(amount: Int) : BankAccount {
        require(amount > 0 ) { "Withdraw amount < 0 )" }
        require(amount <= balance) { "Insufficinet balance}" }
        return BankAccount(balance - amount)
    }
}
fun main() {
    val account1 = BankAccount.create(100)
    val account2 = account1.deposit(36)
    val account3 = account1.withdraw(18)

    println(account1.balance)
    println(account2.balance)
    println(account3.balance)


}
