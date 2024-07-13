import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    val st = StringTokenizer(br.readLine())
    (1 .. n).forEach { i ->
        val item = st.nextToken().toInt()
        (1 .. n).forEach {j -> 
            pq.add(item/j)
        }
    }
    (1 .. n).forEach{
        val result = pq.poll()
        if (it == n) println(result)
    }
}