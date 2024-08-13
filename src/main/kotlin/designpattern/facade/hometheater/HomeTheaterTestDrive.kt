package designpattern.facade.hometheater

class HomeTheaterTestDrive

fun main() {
    val amp = Amplifier("Amplifier")
    val tuner = Tuner("Top-O-Line AM/FM Tuner", amp)
    val dvd = StreamingPlayer("Top-O-Line DVD Player", amplifier = amp)
    val cd = CdPlayer("Top-O-Line CD Player", amplifier = amp)
    val projector = Projector("Top-O-Line Projector", dvd)
    val lights = TheaterLights("Theater Ceiling Lights")
    val screen = Screen("Theater Screen")
    val popper = PopcornPopper("Popcorn Popper")

    val homeTheater = HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper)

    homeTheater.watchMovie("Raiders of the Lost Ark")
    homeTheater.endMovie()
}