package DSA.Leetcode

class Solution19 {
    fun climbStairs(n: Int):Int{
        if(n==1 ||n==2||n==3){
            return n
        }
        val t=IntArray(n+1)
        t[0]=0
        t[1]=1
        t[2]=2
        for(i in 3..n){
            t[i]=t[i-1]+t[i-2]
        }
        return t[n]
    }
}