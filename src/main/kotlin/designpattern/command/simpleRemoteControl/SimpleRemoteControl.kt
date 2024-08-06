package designpattern.command.simpleRemoteControl

class SimpleRemoteControl(
    private var slot: Command
) {
    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonWasPressed() {
        slot.execute()
    }
}
