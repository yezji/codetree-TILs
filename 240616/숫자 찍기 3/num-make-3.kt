import java.util.*
import java.io.*

lateinit var graph: Array<Array<Int>>

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val size = st.nextToken().toInt()
    val type = st.nextToken().toInt()

    graph = Array(size + 2) {
        Array<Int>(size + 2) { 0 }
    }

    (0..size + 1).forEach { i ->
        (0..i).forEach { j ->
            if (i != 0 && j != 0) {
                graph[i][j] = graph[i - 1][j - 1] + graph[i - 1][j]
                if (j - 1 == 0) {
                    graph[i][j] = 1
                }
            }
        }
    }

    printType(type = type, size = size)
}

fun printType(type: Int, size: Int) {
    when (type) {
        1 -> {
            (1..size).forEach { i ->
                (1..i).forEach { j ->
                    print("${graph[i][j]} ")
                }
                print("\n")
            }
        }

        2 -> {
            for (i in size.downTo(1)) {
                for (j in size.downTo(1)) {
                    if (graph[i][j] == 0) print(" ")
                    else print("${graph[i][j]} ")
                }
                print("\n")
            }
        }

        else -> {
            for (i in size.downTo(1)) {
                for (j in size.downTo(1)) {
                    if (graph[j][i] != 0) {
                        print("${graph[j][i]} ")
                    }
                }
                print("\n")
            }
        }
    }
}