import java.io.*
import java.util.*
import java.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val pq = PriorityQueue<Pair<Int, Int>>() {
        a, b -> (Math.abs(a.first) + Math.abs(a.second)) - (Math.abs(b.first) + Math.abs(b.second))
    }
    (1 .. n).forEach {
        st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        pq.add(Pair(x, y))
    }
    (1 .. m).forEach {
        val now = pq.poll()
        pq.add(Pair(now.first + 2, now.second + 2))
    }
    val result = pq.poll()
    println("${result.first} ${result.second}")
}