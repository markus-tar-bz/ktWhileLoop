fun main() {
    countdown()
    printPow()
}

fun countdown() {
    println("Please enter a number:")
    var x = readLine()?.toInt()
    println("Lets count from $x down to 0:")

    while (x != null && x >= 0) {
        println(x)
        x--
    }
}

fun printPow() {
    println("Enter number 1:")
    var x = readLine()?.toInt()
    println("Enter number 2:")
    var y = readLine()?.toInt()

    var result = 1
    var i = 0
    while (x != null && y !=null && i < y) {
        result *=x
        i++
    }
    println("$x to the power of $y is $result")
}