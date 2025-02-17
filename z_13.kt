import java.nio.file.ClosedWatchServiceException
import kotlin.math.sqrt

fun main() {
 try {
    print("Введите а: ")
    var a = readLine()!!.toDouble()
     print("Введите b: ")
     var b = readLine()!!.toDouble()
     print("Введите c: ")
     var c = readLine()!!.toDouble()

     when {
         (a <= 0 || b <= 0  || c <= 0)
                 ->  print("Числа должны быть больше 0")
     }

     val p = (a + b + c) / 2

     val h = 2/a * sqrt(p*(p-a)*(p-b)*(p-c))

     val m = 1/2 * sqrt(2*Math.pow(b,2.0) * 2*Math.pow(c,2.0) - Math.pow(a,2.0))

     val B = (2 * sqrt(b*c*p*(p-a))/(b+c))

     println("Полупериметр = $p")
     println("Высота к стороне а = $h")
     println("Медиана к стороне а = $m")
     println("биссектриса = $B")

 }
 catch (e:Exception) {
     println("Неверный формат данных")
 }
}