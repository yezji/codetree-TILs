import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val mp: MutableMap<String, Int> = mutableMapOf()
    br.readLine()
    br.readLine().split(" ").forEach {
        val value = mp[it]
        if (value == null) {
            mp.put(it, 1)
        } else {
            mp.put(it, value + 1)
        }
    }
    br.readLine().split(" ").forEach {
        print("${mp[it] ?: 0} ")
    }
}