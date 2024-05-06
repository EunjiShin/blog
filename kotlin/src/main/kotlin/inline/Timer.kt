package inline

inline class Minutes(val minutes: Int) {
    fun toMillis(): Millis = Millis(minutes * 60 * 1000)
}

inline class Millis(val milliseconds: Int) {

}

interface Timer {
    fun callAfter(timeMillis: Millis, callback: ()-> Unit)
}

interface User {
    fun decideAboutTime(): Minutes
    fun wakeUp()
}

fun setUpUserWakeUpUser(user: User, timer: Timer) {
    val time = user.decideAboutTime()
    timer.callAfter(time.toMillis()) {
        user.wakeUp()
    }
}