import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val arr1 = Array(n) {0}
    val arr2 = Array(m) {0}
    val pq = PriorityQueue<Pair<Int, Int>>() { a, b -> (a.first + a.second) - (b.first + b.second) }
    st = StringTokenizer(br.readLine())
    (0 until n).forEach { i ->
        arr1[i] = st.nextToken().toInt()
    }
    arr1.sort()
    st = StringTokenizer(br.readLine())
    (0 until m).forEach { j ->
        arr2[j] = st.nextToken().toInt()
    }
    arr2.sort()

    (0 until n).forEach { i ->
        (0 until m).forEach { j ->
            pq.add(Pair(arr1[i], arr2[j]))
        }
    }
    (1 .. k-1).forEach {
        pq.poll()
    }
    println(pq.peek().let {it.first+it.second})
}