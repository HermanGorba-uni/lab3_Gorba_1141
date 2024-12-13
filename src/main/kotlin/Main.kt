import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Введіть x: ")
    val x = readlnOrNull()?.toDoubleOrNull()

    if (x == null) {
        println("Помилка: введіть коректну абсцису")
    }

    val y = var2z3(x!!)

    println("Значення функції в точці x = $x дорівнює y = $y")
}

// Варіант 2
// Завдання 3.1 див. у файл "Завдання 3.1.png"

fun var2z2(x: Double, y: Double): Boolean{
    val distanceFromCenter = sqrt(x.pow(2) + y.pow(2))

    val inSmallRing = distanceFromCenter in 0.0..2.0
    val inBigRing = distanceFromCenter in 2.0..3.0

    val inUpperLeftQuarter = (x <= 0 && y >= 0)
    val inLowerRightQuarter = (x >= 0 && y <= 0)

    return (inSmallRing && inUpperLeftQuarter) || (inBigRing && inLowerRightQuarter)
}

fun var2z3(x: Double) : Double {
    return when {
        x < 0.0 -> {
            -1 * x + 0
        }
        x in 0.0..1.0 -> {
            1 * x + 0
        }
        x in 1.0..2.0 -> {
            0 * x + 1
        }
        x > 2.0 -> {
            -2 * x + 5
        }
        else -> throw IllegalArgumentException("Значення x не входить в ОДЗ")
    }
}
