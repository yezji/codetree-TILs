import java.util.*
import java.io.*
import java.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val pq = PriorityQueue<Int>() {a, b -> if (Math.abs(a) == Math.abs(b)) {a - b}
     else {Math.abs(a) - Math.abs(b)}}
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