package designpattern.command.remoteControl

data class RemoteControl(
    private val onCommands: Array<Command> = Array(7) { NoCommand() },
    private val offCommands: Array<Command> = Array(7) { NoCommand() }
) {
    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }
}
