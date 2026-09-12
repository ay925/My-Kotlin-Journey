package dsa.dsa_master_Sheet

class Solution102{
    fun printTillN(n: Int){
        if (n ==0){
            return
        }
        printTillN(n-1)
        print("$n ")
    }

}

fun main() {
    val solution = Solution102()
   solution.printTillN(5)
}