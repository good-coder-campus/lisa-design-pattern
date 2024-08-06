package designpattern.command.remoteControl

class Light(
    private val location: String
) {
    fun on() {
        println("Light is on")
    }

    fun off() {
        println("Light is off")
    }
}