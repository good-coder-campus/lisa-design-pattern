package designpattern.command.remoteControl

class LightOffCommand(
    private var light: Light
) : Command {
    override fun execute() {
        light.off()
    }
}