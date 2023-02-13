import java.io.Console
import java.lang.NumberFormatException
import java.util.*
import kotlin.math.sin

fun main()
{
try
{
    println("Введите первое число")
    val number1= readLine()!!.toDouble()
    println("Введите второе число")
    val number2= readLine()!!.toDouble()


    if(number1>number2)
     println(number1+1 )


    if(number1<number2)
        println(number2 + number2)

    if (number1==number2)
        println(Math.pow(number1,3.0))

}
catch(e:Exception) { println("Неверно введено")}


//2 задание

try {
    println("Введите число от 0 до 9")
    val num1= readLine()!!.toInt()

    if (num1<0 || num1>9) println("Вы вышли из диапозона")
    val isEnabled = when (num1){
        0->"ноль"
        1->"один"
        2->"два"
        3->"три"
        4->"четыре"
        5->"пять"
        6->"шесть"
        7->"семь"
        8->"восемь"
        9->"девять"
        else ->
            ""
    }
    println(isEnabled )
}
    catch (e:Exception) { println("Неверно введено")}

//задание 3

    try {
        println("Введите возраст")
        val age = readLine()!!.toInt()
        if (age < 0 || age > 112) println("Вы либо не родились либо не можете столько выжить")
        val isEnable = when (age) {
            0, 1, 2 -> "младенец"
            in 3..10 -> "ребенок"
            in 11..17 -> "подросток"
            in 18..40 -> "взрослый"
            in 40..55 -> "пожилой"
            in 55..122 -> "старый"
            else -> ""
        }
        println(isEnable)
    }
    catch (e:NumberFormatException) { println("Неверно введено")}


}
