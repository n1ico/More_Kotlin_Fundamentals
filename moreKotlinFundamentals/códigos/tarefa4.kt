enum class Daypart {
    Morning,
    Afternoon,
    Evening,
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)


fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.Morning, durationInMinutes = 0)
	val event2 = Event(title = "Eat breakfast", daypart = Daypart.Morning, durationInMinutes = 15)
	val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.Afternoon, durationInMinutes = 30)
	val event4 = Event(title = "Practice Compose", daypart = Daypart.Afternoon, durationInMinutes = 60)
	val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.Afternoon, durationInMinutes = 10)
	val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.Evening, durationInMinutes = 45)

    val Eventos = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
           
    for (evento in Eventos) {
        println("Title: "+evento.title)
        println("Description: "+evento.description)
        println("Daypart: "+evento.daypart)
        println("Duration: "+evento.durationInMinutes)
        println("")
    
    val pequenosEventos = Eventos.filter { it.durationInMinutes < 60 }
    println("You have ${pequenosEventos.size} short events.")
}