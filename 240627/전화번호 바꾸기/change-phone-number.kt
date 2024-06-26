import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    var result = Array<String>(3){""}
    input.split("-").let {
        result[0] = it[0]
        result[1] = it[2]
        result[2] = it[1]
    }
    print(result.joinToString("-"))
}