package DSA.Classes

fun main() {
    val matrix=arrayOf(
        intArrayOf(1,2,3,4),
        intArrayOf(5,6,7,8),
        intArrayOf(9,10,11,12)
    )
    val rows=matrix.size
    val cols =matrix[0].size

    var top =0
    var bottom=rows-1
    var left=0
    var right=cols-1

    val result=mutableListOf<Int>()
    while (left<=right && top<=bottom){
    // left to right
    for (i in left ..right){
        result.add(matrix[top][i])
    }
        top++

    // top to bottom
    for (i in top..bottom){
        result.add(matrix[i][right])
    }
        right--
    if (top<=bottom){
        //right to left
        for (i in right downTo left){
            result.add(matrix[bottom][i])
        }
        bottom--
    }
        if (left<=right) {
            //bottom to top
            for (i in bottom downTo top) {
                result.add(matrix[i][left])

            }
            left++
        }
}
    println(result)
}