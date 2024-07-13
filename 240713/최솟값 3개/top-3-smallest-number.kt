import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val pq = PriorityQueue<Int>()
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    (1 .. n).forEach {
        val num = st.nextToken().toInt()
        pq.add(num)
        (if (pq.size < 3) -1
        else {
            var a = pq.poll()
            var b = pq.poll()
            var c = pq.poll()
            var result: Long = a * b * c.toLong()
            pq.add(a)
            pq.add(b)
            pq.add(c)
            result
        }).let {
            println(it)
        }
    }
}