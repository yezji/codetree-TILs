import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stt = TreeSet<Int>()
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    (1 .. n).forEach {
        val num = st.nextToken().toInt()
        stt.add(num)
        (if (stt.size < 3) -1
        else {
            var limit = 3
            var result = 1L
            val iter = stt.iterator()
            while (iter.hasNext() && limit-- > 0) {
                result *= iter.next()
            }
            result
        }).let {
            println(it)
        }
    }
}