import java.util.*
import java.io.*
import java.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toIntOrNull() ?: 0
    val st = StringTokenizer(br.readLine())
    
    val pq = PriorityQueue<Int>()
    (0 until n).forEach { i -> 
        val value = st.nextToken().toIntOrNull() ?: 0
        pq.add(value)
    }

    var first = Integer.MAX_VALUE
    var second = -1
    while (pq.isNotEmpty()) {
        val value = pq.poll()
        if (Math.abs(value - 100) < Math.abs(first - 100)) {
            first = value
        }
        if (value >= 100) {
            second = value
            break
        }
    }
    println("$first $second")
}