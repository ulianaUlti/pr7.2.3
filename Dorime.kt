import java.util.*
import kotlin.math.sin
    fun main() {
        //задание 4
   // try {

      //  println("Введите число")
     //   val x = readLine()!!.toDouble()
      //  if (x>=1)
       //     println(sin(x) *x+1/x)
     //   if (-3<x ||x<1)
     //       println(Math.pow(x,2.0))
     //   if (x<=-3) {

         //   var n8 = 0.0
       //     n8 = (Math.pow(x, 2.0) - 2)
         //   println(Math.sqrt(n8))
        }

 //   }
  //  catch (e:NumberFormatException){
   //     println("Неверно введено")
 //   }


        //задание 5
        try {
        println("Введите 1 число")
        val num1 =readLine()!!.toInt()
        println("Введите 2 число")
        val num2 =readLine()!!.toInt()
       if (num1<0)
           println("Ваше число отрицательное")
            if (num1>0)
                println("Ваше положительное")
            if (num1==0)
                println("Ваше нейтральное")

            if (num2<0)
                println("Ваше число отрицательное")
            if (num2>0)
                println("Ваше положительное")
            if (num2==0)
                println("Ваше нейтральное")

        }
catch (e:NumberFormatException){
    println("Неверный формат")
}

        //задание 6
        try {
            println("Хотите увеличить то выберите 1 ,вычесть 5")
            val nu = readLine()!!.toInt()
            val r =(0..10).random()
            val isEnable = when (nu) {
                1->r*10
                5->r-5
                else->""
            }
            println (isEnable)
        }
            catch (e:NumberFormatException){
            println("Неверно введено")}

}
