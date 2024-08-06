package designpattern.command.undo

class NoCommand: Command {
    override fun execute() {
        println("No command")
    }

    override fun undo() {
        TODO("Not yet implemented")
    }
}