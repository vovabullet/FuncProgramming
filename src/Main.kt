fun main() {
    // Задача 1
    val remains = 20 % 17
    if (remains > 0) {
        println("Получилось значение большее чем ноль!")
    }

    // Задача 2
    println("Возраст:")
    val number = readLine()?.toInt() ?: 0
    val result = if (number > 18) {
        "Вам уже все можно"
    } else if (number == 18) {
        "Ура, Вам 18 лет!"
    } else {
        "Вы еще слишком молоды"
    }
    println(result)

    // Задание 3
    println("У вас есть числа: 2 и 6\n1. Добавить\n2. Отнять\n0. Ничего")
    val choose = readLine()?.toInt() ?: 0
    println(
        when (choose) {
            1 -> 2+6
            2 -> 2-6
            0 -> return
            else -> "Неверный выбор"
        }
    )

    // Задание 4
    print("Введите число от 1 до 7: ")
    val input = readLine()?.toIntOrNull() ?: 0
    println(
        when (input) {
            1 -> "Понедельник"
            2 -> "Вторник"
            3 -> "Среда"
            4 -> "Четверг"
            5 -> "Пятница"
            6 -> "Суббота"
            7 -> "Воскресенье"
            else -> "Ошибка: Введите число от 1 до 7!"
        }
    )

    // Задание 5
    print("Введите первое число: ")
    val a = readLine()?.toIntOrNull() ?: 0
    print("Введите второе число: ")
    val b = readLine()?.toIntOrNull() ?: 0
    print("Введите третье число: ")
    val c = readLine()?.toIntOrNull() ?: 0

    val min = minOf(a, b, c)
    val max = maxOf(a, b, c)

    if (min == max) {
        println("Ошибка")
    } else {
        val average = a + b + c - min - max
        println("Среднее число: $average")
    }

    // Задание 6
    print("Введите экспорт: ")
    val export = readLine()?.toIntOrNull() ?: 0
    print("Введите импорт: ")
    val import = readLine()?.toIntOrNull() ?: 0

    val balance = export - import

    when {
        balance > 0 -> println("Ваша прибыль составила: $balance")
        balance < 0 -> println("Ваши убытки составили: ${balance*-1}")
        else -> println("Сальдо нулевое")
    }

    // Задание 7
    print("Введите первое число: ")
    val f = readLine()?.toIntOrNull() ?: 0
    print("Введите второе число: ")
    val s = readLine()?.toIntOrNull() ?: 0

    val result2 = if (f % 2 == 0 && s % 2 == 0) true else false
    println(result2)


}