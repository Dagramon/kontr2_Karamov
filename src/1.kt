import kotlinx.coroutines.*
suspend fun main() = coroutineScope {
    try
    {
        var plane = PlaneClass("RedWings", "Екатеринбург", "Ульяновск", "12.06.2025", "18:00", 2)
        plane.Info()
        plane.ChangeDestination()
        print("Сколько раз изменить дату?: ")
        var n = readln().toInt()
        for (i in 0..n-1)
        {
            launch {
                delay(800L)
                plane.ChangeDate()
            }
        }
        println("Вводите новые даты")
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}