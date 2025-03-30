fun main() {
    // Задание 1
    println("Иван")
    println(35)
    println(true)

    // Задание 2
    val integer: Int = 5
    val letter: Char = 'F'
    val greeting: String = "Привет"
    val decimal: Double = 90.2
    val constant: Int = 67
    println(greeting)
    
    // Задание 3
    fun numSplitter() {
        print("Четырёхзначное число: ")
        var number = readLine()?.toInt() ?: 0
        while (number < 1000 || number > 9999) {
            println("Число не четырёхзначное")
            number = readLine()?.toInt() ?: 0
        }
        val thousands = number / 1000
        val hundreds = (number % 1000) / 100
        val tens = (number % 100) / 10
        val units = number % 10
        println("$thousands, $hundreds, $tens, $units")
    }
    numSplitter()

    // Задание 4
    val totalDays = 2642
    val years = totalDays / 365
    val remainingDays = totalDays % 365
    val weeks = remainingDays / 7
    val days = remainingDays % 7
    println("Лет: $years, недель: $weeks, дней: $days")

    // Задание 5
    fun mathFun() {
        print("Число: ")
        val n = readLine()?.toInt() ?: 0
        println("$n${n * 2}")
    }
    mathFun()

    // Задание 6
    fun greeting() {
        print("имя: ")
        val name = readLine() ?: ""
        print("возраст: ")
        val age = readLine()?.toInt() ?: 0
        println("Привет, ${name}! Тебе уже ${age}")
    }
    greeting()
}