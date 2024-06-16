fun main() {
    val input = readLine() ?: ""
    (0 .. input.length).forEach { i ->
        (i until input.length + i).forEach { j ->
            print(input[j % input.length])
        }
        print("\n")
    }
}