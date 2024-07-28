import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val pq = PriorityQueue<Int>(reverseOrder())
    st = StringTokenizer(br.readLine())
    (1 .. n).forEach {
        pq.add(st.nextToken().toInt())
    }
    (1 .. m).forEach {
        val value = pq.poll()
        pq.add(value - 1)
    }
    print(pq.peek())
}