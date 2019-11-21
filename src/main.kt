import bird.Bird
import bird.DateTime
import bird.Penguin
import bird.getAgeByBirth

fun main(args: Array<String>) {
    val timestamp: String = "1999/01/01"
    val queen = Bird(timestamp)
    println(queen.age)
    println(getAgeByBirth(DateTime(timestamp)))
    val PenPen = Penguin("South", 12);
    println(PenPen.series)
    println(Week.FRI.getDayNumber())

}