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

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }


fun main() {

    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.Morning, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.Morning, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.Afternoon, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.Afternoon, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.Afternoon, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.Evening, durationInMinutes = 45)
   
    val Eventos = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    val periodos = Eventos.groupBy { it.daypart}

    println("Duration of first event of the day: ${Eventos[0].durationOfEvent}")
}
 