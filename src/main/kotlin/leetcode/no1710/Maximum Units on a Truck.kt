package leetcode.no1710

import java.lang.Math.max
import java.lang.Math.min

class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        var ts = truckSize

        return boxTypes.sortedByDescending { it[1] }
            .map {
                val x = (min(ts, it[0])) * it[1]
                ts = max(0, ts - it[0])
                x
            }.sum()
    }
}

fun main() {
    val n = arrayOf(intArrayOf(5,10), intArrayOf(2,5), intArrayOf(4,7), intArrayOf(3,9))
    print(Solution().maximumUnits(n,10).equals(91))
}