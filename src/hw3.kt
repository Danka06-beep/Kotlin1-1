fun main() {
    val publishedAgo = 1000
    val min = if (publishedAgo > 3599) {
        publishedAgo / 3600
    } else {
        publishedAgo / 60
    }
    val verdict = when (publishedAgo) {
        in 0..59 -> "менее минуты назад"
        in 60..179 -> "минуту назад"
        in 180..299 -> "$min минуты назад"
        in 300..3599 -> "$min минут назад"
        in 3600..17999 -> "$min часа назад"
        else -> "$min часов назад "
    }
    println(verdict)
}