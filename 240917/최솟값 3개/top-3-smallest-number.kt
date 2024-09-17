import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val pq = PriorityQueue<Int>() { n1, n2 ->
        n1 - n2
    }
    (0 until n).forEach {
        val num = st.nextToken().toInt()
        pq.add(num)
        if (pq.size < 3) {
            println("-1")
        }
        else {
            val first = pq.poll()
            val second = pq.poll()
            val third = pq.poll()
            println(first * second * third)
            pq.add(first)
            pq.add(second)
            pq.add(third)
        }
    }
}