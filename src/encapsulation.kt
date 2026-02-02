fun main() {
    var instance_a=A()
    instance_a.a
    instance_a
}
private fun abc(){

}
open class A{
    var a =12
    private var  b =234
    protected fun xyz(){

    }
}
internal class B:A(){
    fun abc(){
        super.xyz()
    }
}