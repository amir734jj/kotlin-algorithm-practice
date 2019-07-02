package algorithms
import java.util.*

object LongestCommonSubstring {

    /**
     * O(n*m*max(n, m))
     */
    @JvmStatic
    fun resolve(str1: String, str2: String): String {
        val array = HashSet<String>()

        var i = 0
        while (i < str1.length) {
            var j = 0
            while (j < str2.length) {
                if (str1[i] === str2[j]) {
                    array.add(extractMatching(str1.substring(i), str2.substring(j)))
                }
                j++
            }
            i++
        }

        return array.maxBy { it.length }!!
    }

    /**
     * O(max(n, m))
     */
    private fun extractMatching(str1: String, str2: String): String {
        val builder = StringBuilder()

        var i = 0
        while (i < str1.length && i < str2.length) {
            if (str1[i] == str2[i]) {
                builder.append(str1[i])
            } else {
                break
            }
            i++
        }

        return builder.toString()
    }
}