package leetcode.no1711

class Solution {
    fun countPairs(deliciousness: IntArray): Int {
        var ret = 0
        val mod = (1e+9 + 7).toInt()
        val hashMap = mutableMapOf<Int, Int>()

        deliciousness.forEach {
            for (i in 0..21) {
                val p = hashMap[(1 shl i) - it] ?: continue
                ret = (ret % mod + p % mod) % mod
            }
            hashMap[it] = (hashMap[it] ?: 0 ) + 1
        }
        return ret
    }
}

fun main() {
    println(Solution().countPairs(intArrayOf(1048576,1048576)))

}