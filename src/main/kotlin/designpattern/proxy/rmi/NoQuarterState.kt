package designpattern.proxy.rmi

class NoQuarterState(
    @Transient
    private val gumballMachine: GumballMachine
): State {
    companion object {
        private const val serialVersionUID = 2L
    }

    override fun insertQuarter() {
        println("동전을 넣으셨습니다.")
        gumballMachine.setStatus(gumballMachine.hasQuarterState)
    }

    override fun ejectQuarter() {
        println("동전을 넣어주세요.")
    }

    override fun turnCrank() {
        println("동전을 넣어주세요.")
    }

    override fun dispense() {
        println("동전을 넣어주세요.")
    }
}