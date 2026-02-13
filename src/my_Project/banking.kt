package my_Project

fun main() {
    val costumer1= Bank(name = "Anupam",3000)
    costumer1.showBalance()
    costumer1.credit(500)
    costumer1.showBalance()
}
class Bank(val name: String, var balance:Int){
    init {
        println("Account holder name is $name")
    }
    fun showBalance(){
        println("Your Balance is $balance")
    }
    fun credit(creditedAmount:Int){
        if (creditedAmount>0){
            balance+=creditedAmount
        }else{
            println("Negative credit is not allowed")
        }

    }
    fun debited(debitedAmount:Int){
        balance-=debitedAmount
    }

}