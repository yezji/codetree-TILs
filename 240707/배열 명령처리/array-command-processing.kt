import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val list = LinkedList<LinkedList<Int>>()
    (1..n).forEach {
        val ll = LinkedList<Int>()
        (1..n).forEach {
            ll.push(0)
        }
        list.push(ll)
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
                list[i][x] = 1
            }

            2 -> {
                list[i][x] = 0
            }

            3 -> {
                list[i].addFirst(0)
                list[i].removeLast()
            }

            else -> {
                list[i].removeFirst()
                list[i].addLast(0)
            }
        }
    }

    val sett = mutableSetOf<LinkedList<Int>>()
    (0 until n).forEach { i ->
        sett.add(list[i])
    }
    print(sett.size)
}