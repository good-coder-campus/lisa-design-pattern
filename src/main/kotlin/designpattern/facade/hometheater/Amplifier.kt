package designpattern.facade.hometheater

class Amplifier(
    private val description: String,
    private var tuner: Tuner? = null,
    private var player: StreamingPlayer? = null,
) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setStereoSound() {
        println("$description stereo mode on")
    }

    fun setSurroundSound() {
        println("$description surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(level: Int) {
        println("$description setting volume to $level")
    }

    fun setTuner(tuner: Tuner) {
        println("$description setting tuner to ${tuner}")
        this.tuner = tuner
    }

    fun setStreamingPlayer(player: StreamingPlayer) {
        println("$description setting Streaming Player to $player")
        this.player = player
    }

    override fun toString(): String {
        return description
    }
}