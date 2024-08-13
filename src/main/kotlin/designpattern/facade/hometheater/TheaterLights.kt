package designpattern.facade.hometheater

class TheaterLights(
    private val description: String,
) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun dim(level: Int) {
        println("$description dimming to $level%")
    }

    override fun toString(): String {
        return description
    }
}
