import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>()
    (1 .. n).forEach {
        val value = br.readLine().toInt()
        if (value == 0) {
            if (pq.isEmpty()) {
                println("0")
            } else {
                println(pq.poll())
            }
        } else {
            pq.add(value)
        }
    }
}