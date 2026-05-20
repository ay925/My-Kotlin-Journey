package self_learning


fun main() {
    val tile: Tile= Red("Anupam",25)
    when(tile){
        is Blue -> println(tile.points*2)
        is Red -> println(tile.points*3)
    }
}
sealed class Tile
class Red(val type: String,val points: Int): Tile()
class Blue(val type: String,val points: Int): Tile()