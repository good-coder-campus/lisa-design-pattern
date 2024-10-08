package designpattern.facade.hometheater

class CdPlayer(
    private val description: String,
    private var currentTrack: Int = 0,
    private val amplifier: Amplifier,
    private var title: String? = null,
) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun eject() {
        title = null
        println("$description eject")
    }

    fun play(title: String) {
        this.title = title
        currentTrack = 0
        println("$description playing \"$title\"")
    }

    fun play(track: Int) {
        if (title == null) {
            println("$description can't play track $track no cd inserted")
        } else {
            currentTrack = track
            println("$description playing track $currentTrack of \"$title\"")
        }
    }

    fun stop() {
        currentTrack = 0
        println("$description stopped")
    }

    fun pause() {
        println("$description paused \"$title\"")
    }

    override fun toString(): String {
        return description
    }
}
