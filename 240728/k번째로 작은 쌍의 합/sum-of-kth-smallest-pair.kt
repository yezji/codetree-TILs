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
    val pq = PriorityQueue<Triple<Int, Int, Int>>() { a, b -> if (a.first != b.first) {
            a.first - b.first
        } else if (a.second != b.second) {
            a.second - b.second
        } else {
            a.third - b.third
        } }
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

    (0 until n).forEach { i->
        pq.add(Triple(arr1[i] + arr2[0], i, 0))
    }
    (0 until k-1).forEach { i ->
        val mini = pq.poll()
        var idx1 = mini.second
        var idx2 = mini.third

        idx2++
        if (idx2 < m) {
            pq.add(Triple(arr1[idx1] + arr2[idx2], idx1, idx2))
        }
    }
    println(pq.peek().first)
}