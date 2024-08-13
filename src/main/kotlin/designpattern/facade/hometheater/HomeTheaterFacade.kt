package designpattern.facade.hometheater

class HomeTheaterFacade(
    private val amp: Amplifier,
    private val tuner: Tuner,
    private val player: StreamingPlayer,
    private val cd: CdPlayer,
    private val projector: Projector,
    private val lights: TheaterLights,
    private val screen: Screen,
    private val popper: PopcornPopper,
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setStreamingPlayer(player)
        amp.setSurroundSound()
        amp.setVolume(5)
        player.on()
        player.play(movie)
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        player.stop()
        player.off()
    }

    fun listenToRadio(frequency: Double) {
        println("Tuning in the airwaves...")
        tuner.on()
        tuner.setFrequency(frequency)
        amp.on()
        amp.setVolume(5)
        amp.setTuner(tuner)
    }

    fun endRadio() {
        println("Shutting down the tuner...")
        tuner.off()
        amp.off()
    }
}
