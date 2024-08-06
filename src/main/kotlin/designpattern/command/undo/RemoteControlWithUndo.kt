package designpattern.command.undo

data class RemoteControlWithUndo(
    private val onCommands: Array<Command> = Array(7) { NoCommand() },
    private val offCommands: Array<Command> = Array(7) { NoCommand() },
    private var undoCommand: Command = NoCommand()
) {
    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
        undoCommand = NoCommand()
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }
}
