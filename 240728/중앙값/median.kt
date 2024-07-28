import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    (1 .. t).forEach {
        val m = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val maxPq = PriorityQueue<Int>(reverseOrder())
        val minPq = PriorityQueue<Int>()
        (1 .. m).forEach { num ->
            val value = st.nextToken().toInt()
            if (num == 1) {
                maxPq.add(value)
            } else {
                if (maxPq.peek() >= value) {
                    maxPq.add(value)
                }
                else {
                    minPq.add(value)
                }
                if (maxPq.size > minPq.size) {
                    minPq.add(maxPq.poll())
                } else {
                    maxPq.add(minPq.poll())
                }
            }
            
            if (num % 2 != 0) {
                if (maxPq.size > minPq.size) {
                    print("${maxPq.peek()} ")
                }
                else {
                    print("${minPq.peek()} ")
                }
            }
        }
        println()
    }
}