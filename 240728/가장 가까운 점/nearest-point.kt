import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val pq = PriorityQueue<Pair<Int, Int>>() {
        a, b -> if (a.first+a.second != b.first+b.second) {
            (a.first + a.second) - (b.first + b.second)
        } else if (a.first != b.first) {
            a.first - b.first
        } else {
            a.second - b.second
        }
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