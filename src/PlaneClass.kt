class PlaneClass(marka: String, punkt: String, destination: String, dateOfFlight: String, timeOfFlight: String, hours: Int) : abstract(marka, punkt, destination, dateOfFlight, timeOfFlight, hours)
{
    override fun Info()
    {
        println("Информация\nМарка самолёта: $marka\nПункт отправления: $punkt\nПункт назначения: $destination\nДата вылета: $dateOfFlight\nВремя вылета: $timeOfFlight\nВремя в полёте: $hours часа")
    }
    override fun ChangeDestination()
    {
        println("Введите новый пункт назначения: ")
        destination = readln()
        hours += 1
    }

    override fun ChangeDate()
    {
        println("Введите новую дату в формате **.**.****")
        dateOfFlight = readln()
        Info()
    }
}