import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val mp = mutableMapOf<Int, Int>()
    (1 .. n).forEach {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        if (mp.containsKey(x).not() || mp.getValue(x) > y) mp[x] = y
    }
    var sum = 0
    mp.values.forEach { 
        sum += it
    }
    println(sum)
}