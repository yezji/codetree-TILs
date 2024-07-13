import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    var sett = TreeSet<Int>()
    st = StringTokenizer(br.readLine())
    (1 .. n).forEach {
        sett.add(st.nextToken().toInt())
    }
    st = StringTokenizer(br.readLine())
    (1 .. m).forEach {
        val value = st.nextToken().toInt()
        val result = sett.floor(value)
        println(result ?: -1)
        if (result != null) sett.remove(result)
    }
}