fun main() {
    val direction=Direction.EAST
//    println(direction.number)
//    for (i in Direction.entries){
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
        println("Name of the Direction = $this")
    }
}