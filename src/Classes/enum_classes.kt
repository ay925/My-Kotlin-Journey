package Classes

fun main() {
    val direction=Direction.EAST
//    println(direction.number)
//    for (i in Classes.Direction.entries){
//        println(i.name)
//    }
    direction.printDirectionName()
}
enum class Direction(val number: Int){
    EAST(1),
    WEST(2),
    NORTH(3),
    SOUTH(4);
    fun printDirectionName(){
        println("Classes.Name of the Classes.Direction = $this")
    }
}