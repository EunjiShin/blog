package inline

interface TimeUnit {
    val millis: Long
}

inline class Minutes(val minutes: Long): TimeUnit {
    override val millis: Long get() = minutes * 60 * 1000
}

inline class Millis(val milliseconds: Long): TimeUnit {
    override val millis: Long get() = milliseconds
}

fun setUpTimer(time: TimeUnit) {
    val millis = time.millis
}
