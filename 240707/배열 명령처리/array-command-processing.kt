import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = Array<Array<Int>>(n+2){
        Array<Int>(n+2){0}
    }
    (0 until m).forEach {
        st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        var i = st.nextToken().toInt()
        var x = 0
        if (a <= 2) {
            x = st.nextToken().toInt()
        }

        when (a) {
            1 -> {
                arr[i][x] = 1
            }
            2 -> {
                arr[i][x] = 0
            }
            3 -> {
                for (k in n.downTo(1)) {
                    arr[i][k] = arr[i][k-1]
                }
            }
            else -> {
                (1 .. n).forEach { k ->
                    arr[i][k] = arr[i][k+1]
                }
            }
        }
    }

    val sett = mutableSetOf<String>()
    (1 .. n).forEach { i ->
        sett.add(arr[i].contentToString())
    }
    print(sett.size)
}