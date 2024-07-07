import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    (if (n == 100) "pass" else "failure").let {
        print(it)
    }
}