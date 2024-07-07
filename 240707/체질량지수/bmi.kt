import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val h = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val b = (10000*w) / (h*h)
    println(b)
    if (b >= 25) println("Obesity")
}