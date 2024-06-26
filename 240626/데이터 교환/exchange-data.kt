fun main() {
    var a = 5
    var b = 6
    var c = 7
    val temp = a
    a = c
    c = b
    b = temp
    print("$a\n$b\n$c")
}