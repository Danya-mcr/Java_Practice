fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {
    val number = 52

    if (number.isEven()) {
        println("четное число")
    } else {
        println("нечётное число")
    }
}