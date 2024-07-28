import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = Array(n){0}
    (0 until n).forEach { idx ->
        arr[idx] = st.nextToken().toInt()
    }

    var maxi = Double.MIN_VALUE
    (1 .. n-2).forEach { k->
        var pq = PriorityQueue<Int>()
        (k until n).forEach { idx->
            pq.add(arr[idx])
        }
        pq.poll()
        var cnt = 0
        var sum: Double = 0.0
        while (pq.isEmpty().not()) {
            cnt++
            sum += pq.poll()
        }
        if (maxi < sum / cnt) maxi = sum / cnt
    }
    println(String.format("%.2f", maxi))
}