package self_learning

abstract class AbstractClass {
    abstract fun onSuccess()
    abstract fun onFailed(error: String)
    fun onLoading(){
        println("Loading...")
    }
}
class ResultAb: AbstractClass() {
    override fun onSuccess() {
        println("Success in Result Ab")
    }

    override fun onFailed(error: String) {
        println("Failed in Result Ab")
    }
}
class ResultBc: AbstractClass(){
    override fun onSuccess() {
        println("Success in Result Bc")

    }

    override fun onFailed(error: String) {
        println("Failed in Result Bc")

    }

}
fun main() {
    val data= ResultAb()
    val data2= ResultBc()
    data.onFailed("fdf")
    data2.onFailed("df")
    data.onLoading()
    data2.onLoading()
}