import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    val n = br.readLine().toInt()
    (1 .. n).forEach {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push" -> {
                pq.add(st.nextToken().toInt())
            }
            "pop" -> {
                println(pq.poll())
            }
            "size" -> {
                println(pq.size)
            }
            "empty" -> {
                println(if (pq.isEmpty()) 1 else 0)
            }
            "top" -> {
                println(pq.peek())
            }
        }
    }
}