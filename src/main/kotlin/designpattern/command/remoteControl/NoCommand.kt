package designpattern.command.remoteControl

class NoCommand: Command {
    override fun execute() {
        println("No command")
    }
}