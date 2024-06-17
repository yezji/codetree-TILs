import java.io.*
import java.util.*

lateinit var arr: Array<Int>
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    st = StringTokenizer(br.readLine())
    arr = Array<Int>(n + 1) { 0 }
    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
    }

    for (i in 0 until m) {
        st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()
        command(type = a, first = b, second = c)
    }

    for (i in 1..n) {
        print("${arr[i]} ")
    }
}

fun command(type: Int, first: Int, second: Int) {
    when (type) {
        1 -> {
            arr[first] = second
        }

        2 -> {
            for (i in first..second) {
                arr[i] = if (arr[i] == 0) 1 else 0
            }
        }

        3 -> {
            for (i in first..second) {
                arr[i] = 0
            }
        }

        else -> {
            for (i in first..second) {
                arr[i] = 1
            }
        }
    }
}