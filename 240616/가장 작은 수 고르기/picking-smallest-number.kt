import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    var minValue = Integer.MAX_VALUE
    (0 until 10).forEach { i -> 
        val n = st.nextToken().toIntOrNull() ?: 0
        if (minValue > n) minValue = n
    }
    print(minValue)
}