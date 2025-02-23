import kotlin.math.sqrt


fun main() {

    try {
        print("Введите первый член геометрической прогрессии: ")
        val firstMemberOfProgression = readLine()!!.toDouble()

        print("Введите знаменатель геометрической прогрессии: ")
        val denominatorOfProgression = readLine()!!.toDouble()


        if (denominatorOfProgression == 0.0 || denominatorOfProgression == 1.0) {
            println("Знаменатель геометрической прогрессии не должен равняться 0 или 1")
            return
        }

        print("Введите начальное значение K: ")
        val K = readLine()!!.toInt()

        print("Введите конечное значение P: ")
        val P = readLine()!!.toInt()


        if (K < P) {

            val kMemberOfProgression = firstMemberOfProgression * Math.pow(denominatorOfProgression, (K - 1).toDouble())


            val sum = firstMemberOfProgression * (Math.pow(denominatorOfProgression, P.toDouble()) - Math.pow(denominatorOfProgression, (K - 1).toDouble())) / (denominatorOfProgression - 1)

            println("Член(K) прогрессии = $kMemberOfProgression")
            println("Сумма членов прогрессии от K до P = $sum")
        } else {
            println("K должно быть меньше P")
        }

    }
    catch (e:Exception) {
        println("Неверный формат данных")
    }



}