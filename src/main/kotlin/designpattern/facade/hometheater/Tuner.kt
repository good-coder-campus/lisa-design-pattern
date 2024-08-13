package designpattern.facade.hometheater

class Tuner(
    private val description: String,
    private val amplifier: Amplifier,
    private var frequency: Double = 0.0,
) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setFrequency(frequency: Double) {
        println("$description setting frequency to $frequency")
        this.frequency = frequency
    }

    fun setAm() {
        println("$description setting AM mode")
    }

    fun setFm() {
        println("$description setting FM mode")
    }

    override fun toString(): String {
        return description
    }
}