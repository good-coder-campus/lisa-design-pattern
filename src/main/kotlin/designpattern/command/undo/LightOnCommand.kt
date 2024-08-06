package designpattern.command.undo

class LightOnCommand(
    private var light: Light
) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}