// Задача 1
fun rounderUp(num : Int ) : String {
    if (num < 1000) {
        return num.toString()
    }
    return (num/1000).toString() + "K"
}

// Задача 2
fun yearsEnding (year : Int) : String {
    val lastTwo = year % 100
    val lastOne = year % 10
    return when {
        lastTwo in 11..14 -> "$year лет"
        lastOne == 1 -> "$year год"
        lastOne in 2..4 -> "$year года"
        else -> "$year лет"
    }
}

fun main() {
    // Задача 1
    println(rounderUp(1234))
    println(rounderUp(123))
    println(rounderUp(12345))

    // Задача 2
    println(yearsEnding(12))
    println(yearsEnding(1992))
    println(yearsEnding(997))
}