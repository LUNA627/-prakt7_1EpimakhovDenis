

fun main() {

    try {

        print("Введите х: ")
        val x = readLine()!!.toDouble()

        val result =  Math.sqrt(Math.abs(x)) * (Math.log(Math.pow(x, 2.0))) / (((-5.0 / 4.0 * x) + Math.exp(((x/2.0)))))
        val finalResult = String.format("%.2f", result)
        println("Ответ: $finalResult")

    } catch (e: Exception) {
        println("Неверный формат данных")
    }
}