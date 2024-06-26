import java.util.*
import java.io.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toFloat()
    print(String.format("%.2f", a+1.5))
}