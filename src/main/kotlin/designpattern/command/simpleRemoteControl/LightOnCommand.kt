package designpattern.command.simpleRemoteControl

class LightOnCommand(
    private val light: Light
): Command {
    override fun execute() {
        light.on()
    }
}