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
    val pq = PriorityQueue<Int>()
    var sum: Double = 0.0
    var maxi = Double.MIN_VALUE
    pq.add(arr[n-1]) // 마지막 원소
    sum += arr[n-1]
    ((n-2).downTo(1)).forEach { k->
        pq.add(arr[k])
        sum += arr[k]

        val avg = (sum - pq.peek()) / (n-k-1).toDouble()
        if (maxi < avg) maxi = avg
    }

    println(String.format("%.2f", maxi))
}