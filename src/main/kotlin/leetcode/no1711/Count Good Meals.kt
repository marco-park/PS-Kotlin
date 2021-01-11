package leetcode.no1711

import java.util.*

class Solution {
    fun countPairs(deliciousness: IntArray): Int {
        var ret = 0
        val mod = (1e+9 + 7).toInt()
        val hashMap = HashMap<Int, Int>()

        deliciousness.forEach {
            for (i in 0..21) {
                val target = (1 shl i) - it
                val p = hashMap[target] ?: continue
                ret = (ret % mod + p % mod) % mod
            }
            hashMap.putIfAbsent(it, 0)
            hashMap[it] = hashMap[it]!! + 1
        }
        return ret
    }
}

fun main() {
    println(Solution().countPairs(intArrayOf(1048576,1048576)))

}