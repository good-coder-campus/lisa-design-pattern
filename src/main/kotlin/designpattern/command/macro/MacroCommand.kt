package designpattern.command.macro

class MacroCommand(
    private val commands: Array<Command>
): Command {
    override fun execute() {
        for (command in commands) {
            command.execute()
        }
    }
}