import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>(reverseOrder())
    (1 .. n).forEach {
        val num = br.readLine().toInt()
        if (num == 0) {
            if (pq.isEmpty()) {
                println("0")
            } else {
                println(pq.poll())
            }
        } else {
            pq.add(num)
        }
    }
}