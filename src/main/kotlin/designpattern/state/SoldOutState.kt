package designpattern.state

class SoldOutState (
    private val gumballMachine: GumballMachine,
): State {
    override fun insertQuarter() {
        println("매진되었습니다.")
    }

    override fun ejectQuarter() {
        println("매진되었습니다.")
    }

    override fun turnCrank() {
        println("매진되었습니다.")
    }

    override fun dispense() {
        println("매진되었습니다.")
    }
}