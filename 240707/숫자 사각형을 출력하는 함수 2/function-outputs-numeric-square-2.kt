import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    (1 .. n).forEach { i ->
        var last = i
        (1 .. n).forEach { j ->
            print("$last ")
            last *= 2
        }
        print("\n")
    }
}