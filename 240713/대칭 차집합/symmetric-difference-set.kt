import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val mp = mutableMapOf<Int, Int>()
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())
    (1 .. a).forEach {
        val item = st.nextToken().toInt()
        mp[item] = mp.getOrDefault(item, 0) + 1
    }
    st = StringTokenizer(br.readLine())
    (1 .. b).forEach {
        val item = st.nextToken().toInt()
        mp[item] = mp.getOrDefault(item, 0) + 1
    }
    var sum = 0
    val iter = mp.iterator()
    while (iter.hasNext()) {
        val item = iter.next()
        if (item.value == 1) sum += 1
    }
    println(sum)
}