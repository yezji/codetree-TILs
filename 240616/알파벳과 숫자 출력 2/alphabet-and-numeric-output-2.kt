fun main() {
    val input = readLine() ?: ""
    val n = input.toIntOrNull() ?: 0
    var ch = 0
    var num = 0

    (0 .. n).forEach { i -> 
        (0 until n-i).forEach { j -> 
            print("${'A' + (ch%26)} ")
            ch++
        }
        (0 until i).forEach { j -> 
            print("${num%10} ")
            num++
        }
        print("\n")
    }
}