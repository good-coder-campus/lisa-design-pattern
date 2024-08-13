package designpattern.facade.hometheater

class StreamingPlayer(
    private val description: String,
    private var currentChapter: Int = 0,
    private val amplifier: Amplifier,
    private var movie: String? = null,
) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun play(movie: String) {
        this.movie = movie
        currentChapter = 0
        println("$description playing \"$movie\"")
    }

    fun stop() {
        currentChapter = 0
        println("$description stopped \"$movie\"")
    }

    fun pause() {
        println("$description paused \"$movie\"")
    }

    fun setTwoChannelAudio() {
        println("$description set two channel audio")
    }

    fun setSurroundAudio() {
        println("$description set surround audio")
    }

    override fun toString(): String {
        return description
    }
}
