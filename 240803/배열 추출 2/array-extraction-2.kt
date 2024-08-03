import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val pq = PriorityQueue<Int>()
    val n = br.readLine().toInt()
    (1 .. n).forEach {
        val num = br.readLine().toInt()
        if (num != 0) {
            pq.add(num)
        } else {
            println(pq.poll() ?: "0")
        }
    }
}