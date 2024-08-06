package designpattern.command.undo

interface Command {
    fun execute()

    fun undo()
}