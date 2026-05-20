package self_learning

interface Result {
    fun onSuccess()
    fun onFailed(error: String)
}
class GetData: Result{
    override fun onSuccess() {
        println("Success to get data")
    }

    override fun onFailed(error: String) {
        println("Failed to get data")
    }

}
class ClearData: Result{
    override fun onSuccess() {
        println("Data Cleaned Successfully")
    }

    override fun onFailed(error: String) {
        println("Data not cleaned please try again")
    }

}
fun main() {
    val data= GetData()
    val clearData = ClearData()
    data.onFailed("dfd")
    clearData.onFailed("dfd")
}