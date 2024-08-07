import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>(reverseOrder())
    val st = StringTokenizer(br.readLine())
    (1 .. n).forEach {
        pq.add(st.nextToken().toInt())
    }
    while (pq.size >= 2) {
        val one = pq.poll()
        val two = pq.poll()
        if (one != two) pq.add(one-two)
    }
    println(pq.poll() ?: "-1")
}