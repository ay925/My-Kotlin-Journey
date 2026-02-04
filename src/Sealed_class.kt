
fun main() {
    var loading=Result.Loading()
    var success=Success()
    var failure=Failure()
    stateCheck(loading)
    stateCheck(failure)
    stateCheck(success)
}
fun stateCheck(state:Result){
    when(state){
        is Failure -> println(state.message)
        is Result.Loading -> println("Loading....")
        is Success -> println(state.message)
    }
}
sealed class Result{
    class Loading():Result()
}
class Success():Result(){
    val message="State is success"
}
class Failure():Result(){
    val message="State is failure"
}