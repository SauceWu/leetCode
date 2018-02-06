/**
 * @author sauceWu .
 * @since 2018/1/30 14:44
 */

class JewelsAndStones {
    fun numJewelsInStones(J: String, S: String): Int {
        var count = 0
        S.toCharArray().forEach loop@ { s1 ->
            J.toCharArray().forEach  {
                if (it == s1) {
                    count++
                    return@loop
                }
            }
        }

        return count
    }
}
