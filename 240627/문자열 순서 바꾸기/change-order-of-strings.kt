import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var s = br.readLine()
    var t = br.readLine()
    val temp = t
    t = s
    s = temp
    print("$s\n$t")
}