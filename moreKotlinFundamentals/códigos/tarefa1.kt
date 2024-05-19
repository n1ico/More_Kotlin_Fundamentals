data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

fun main() {
    val evento = Event(title="Study Kotlin", description="Commit to studying Kotlin at least 15 minutes per day.", daypart="Evening", durationInMinutes=15)
    println("Title: "+evento.title)
    println("Description: "+evento.description)
    println("Daypart: "+evento.daypart)
    println("Duration in minutes: "+evento.durationInMinutes)
}