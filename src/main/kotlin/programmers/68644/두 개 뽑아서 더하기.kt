package programmers.`68644`

import java.util.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = TreeSet<Int>()
        numbers.forEachIndexed { i ,e1 -> 
            numbers.forEachIndexed { j, e2 ->
                if (i != j) answer.add(e1 + e2)
            }
        }
        return answer.toIntArray()
    }
}

fun main() {
    val s = Solution()
    val ret = s.solution(intArrayOf(5,0,2,7))
    for (i in ret) print("$i ")
}