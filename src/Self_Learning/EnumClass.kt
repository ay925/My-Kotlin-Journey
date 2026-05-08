package Self_Learning

fun main() {
//    val day= Day.Monday
//    println(day)
    val tile: Tile= Red("Anupam",25)
    when(tile){
        is Blue -> println(tile.points*2)
        is Red -> println(tile.points*3)
    }
}
enum class Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
sealed class Tile
class Red(val type: String,val points: Int): Tile()
class Blue(val type: String,val points: Int): Tile()