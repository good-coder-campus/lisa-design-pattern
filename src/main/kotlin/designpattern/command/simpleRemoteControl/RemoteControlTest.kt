package designpattern.command.simpleRemoteControl

class RemoteControlTest {
    fun main() {
        val light = Light()
        val lightOn = LightOnCommand(light)
        val remote = SimpleRemoteControl(lightOn)

        remote.buttonWasPressed()
    }
}