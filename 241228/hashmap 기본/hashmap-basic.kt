import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val mp: MutableMap<String, String> = mutableMapOf()
    var n = br.readLine().toInt()
    while (n-- > 0) {
        br.readLine().split(" ").let {
            when (it[0]) {
                "add" -> {
                    mp.put(it[1], it[2])
                }
                "remove" -> {
                    mp.remove(it[1])
                }
                "find" -> {
                    (mp[it[1]] ?: "None")
                    .also {
                        println(it)
                    }
                }
                else -> Unit
            }
        }
    }
}