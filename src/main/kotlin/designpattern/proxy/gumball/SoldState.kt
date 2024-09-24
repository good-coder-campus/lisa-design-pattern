package designpattern.proxy.gumball

import designpattern.proxy.gumball.GumballMachine

class SoldState(
    private val gumballMachine: GumballMachine
): State {
    override fun insertQuarter() {
        println("알맹이를 내보내고 있습니다.") //부적절
    }

    override fun ejectQuarter() {
        println("이미 알맹이를 뽑으셨습니다.") // 부적절
    }

    override fun turnCrank() {
        TODO("손잡이는 한 번만 돌려 주세요") // 부적절
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.count > 0) {
            gumballMachine.setStatus(gumballMachine.noQuarterState)
        } else {
            println("더 이상 알맹이가 없습니다.")
            gumballMachine.setStatus(gumballMachine.soldOutState)
        }
    }
}