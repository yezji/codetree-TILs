import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = Array<Int>(n) { 0 }
    (0 until m).forEach {
        st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val i = st.nextToken().toInt() - 1
        var x = 0
        if (a <= 2) {
            x = st.nextToken().toInt() - 1
        }

        when (a) {
            1 -> {
                arr[i] = arr[i] or (1 shl (n-x))
            }

            2 -> {
                arr[i] = arr[i] and (1 shr (n-x)).inv()
            }

            3 -> {
                arr[i] = arr[i] shr (1)
            }

            else -> {
                arr[i] = (arr[i] shl (1)) and ((1 shl 20) - 1)
            }
        }
    }

    val sett = mutableSetOf<Int>()
    (0 until n).forEach { i ->
        sett.add(arr[i])
    }
    print(sett.size)
}