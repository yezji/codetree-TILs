import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val stt = TreeSet<Int>()
    val st = StringTokenizer(br.readLine())

    (1 .. n).forEach { i ->
        val item = st.nextToken().toInt()
        (1 .. n).forEach {j -> 
            stt.add(item/j)
            if (stt.size > n) stt.pollFirst()
        }
    }
    (1 .. n).forEach{
        val result = stt.pollLast()
        if (it == n) println(result)
    }
}