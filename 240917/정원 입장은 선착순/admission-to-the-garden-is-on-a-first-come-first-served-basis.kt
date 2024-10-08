import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbered = PriorityQueue<Triple<Int, Int, Int>>() { p1, p2 ->
        if (p1.second == p2.second) {
            p1.first - p2.first
        }
        else {
            p1.second - p2.second
        }
    }

    val n = br.readLine().toInt()
    (0 until n).forEach { idx ->
        val st = StringTokenizer(br.readLine())
        val arrived = st.nextToken().toInt()
        val duration = st.nextToken().toInt()
        numbered.add(Triple(idx, arrived, duration))
    }
    numbered.add(Triple(n, Int.MAX_VALUE, 0))

    val waiting = PriorityQueue<Triple<Int, Int, Int>>() { p1, p2 -> 
        p1.first - p2.first
    }


    var maxi = 0
    var exitTime = 0
    while (!numbered.isEmpty()) {
        val now = numbered.poll()

        while (now.second > exitTime && !waiting.isEmpty()) {
            val waitted = waiting.poll()
            if (maxi < exitTime - waitted.second) {
                maxi = exitTime - waitted.second
            }
            exitTime += waitted.third
        }

        if (now.second > exitTime) { // no need wait
            exitTime = now.second + now.third
        }
        else { // needs wait
            waiting.add(Triple(now.first * -1, now.second, now.third))
        }
    }

    println(maxi)
    
}