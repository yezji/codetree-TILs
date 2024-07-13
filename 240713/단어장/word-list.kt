import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val mp = TreeMap<String, Int>()
    (1 .. n).forEach {
        val word = br.readLine()
        if (mp.containsKey(word).not()) {
            mp[word] = 1
        } else {
            mp[word] = mp.getValue(word) + 1
        }
    }
    val iter = mp.iterator()
    while (iter.hasNext()) {
        val item = iter.next()
        println("${item.key} ${item.value}")
    }
}