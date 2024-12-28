import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val mp: MutableMap<Int, Int> = mutableMapOf()
    var st = StringTokenizer(br.readLine())
    var n = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    st = StringTokenizer(br.readLine())
    while (n-- > 0) {
        val key = st.nextToken().toInt()
        val value = mp[key]
        if (value == null) {
            mp.put(key, 1)
        } else {
            mp.put(key, value + 1)
        }
    }
    st = StringTokenizer(br.readLine())
    while (m-- > 0) {
        val key = st.nextToken().toInt()
        print("${mp[key] ?: 0} ")
    }
}