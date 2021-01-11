package programmers.no68644

import java.util.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = TreeSet<Int>()
        numbers.forEachIndexed { i, e1 ->
            numbers.forEachIndexed { j, e2 ->
                if (i != j) answer.add(e1 + e2)
            }
        }
        return answer.toIntArray()
    }
}

fun main() {
    val n = Solution().solution(intArrayOf(2,1,3,4,1))
    val a = intArrayOf(2,3,4,5,6,7)
    print(n.contentEquals(a))
}