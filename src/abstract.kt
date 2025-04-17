abstract class abstract(override var marka : String, override var punkt: String, override var destination: String, override var dateOfFlight: String, override var timeOfFlight: String, override var hours: Int) : Plane
{
    override fun Info()
    {
        println("Абстрактная информация")
    }

    override fun ChangeDate()
    {
        println("Изменение даты")
    }

    override fun ChangeDestination() {
        println("Изменение пункта назначения")
    }
}