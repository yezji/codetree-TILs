import java.util.*
import java.io.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = br.readLine().toInt()
    print("$a $b $c")
}