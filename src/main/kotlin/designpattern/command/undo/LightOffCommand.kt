package designpattern.command.undo

class LightOffCommand(
    private var light: Light
) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}