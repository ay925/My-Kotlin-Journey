package self_learning

interface PermissionInternet{
    fun accessPermission()
}
interface Result: PermissionInternet {
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

    override fun accessPermission() {
        println("Get data access your permission")
    }

}
class ClearData: Result{
    override fun onSuccess() {
        println("Data Cleaned Successfully")
    }

    override fun onFailed(error: String) {
        println("Data not cleaned please try again")
    }

    override fun accessPermission() {
        println("Get data access your permission")
    }

}
class AccessUserPermission(): PermissionInternet, Result{
    override fun accessPermission() {
        println("User permission access")
    }

    override fun onSuccess() {
        println("User permission granted")
    }

    override fun onFailed(error: String) {
        println("User permission denied")
    }

}
fun main() {
    val data= GetData()
    val accessUserPermission= AccessUserPermission()
    accessUserPermission.accessPermission()
    val clearData = ClearData()
    data.onFailed("dfd")
    clearData.onFailed("dfd")
}