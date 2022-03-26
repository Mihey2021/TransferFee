const val PERCENT = 0.0075
const val TOTAL_IN_ROUBLE = 100.0
const val MIN_TAX = 35.0 * TOTAL_IN_ROUBLE

fun main() {
    print("Введите сумму перевода: ")
    val amount = readln().toDouble() * TOTAL_IN_ROUBLE;
    val commission = if (amount <= MIN_TAX) MIN_TAX else amount * PERCENT
    val commissionRub: Double = commission / TOTAL_IN_ROUBLE
    println("Комиссия за перевод составит $commissionRub руб.")
}