package designpattern.state

class GumballMachineTestDrive

fun main() {
    val gumballMachine = GumballMachine(5)

    println(gumballMachine)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    println(gumballMachine)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    println(gumballMachine)
}