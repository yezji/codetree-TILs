fun main() {
    var a = 1
    var b = 2
    var c = 3
    val sum = a+b+c
    c = sum
    b = c
    a = b
    print("$a $b $c")
}