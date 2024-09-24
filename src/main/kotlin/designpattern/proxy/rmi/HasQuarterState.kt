package designpattern.proxy.rmi

import kotlin.random.Random

class HasQuarterState(
    private val gumballMachine: GumballMachine,
    private val randomWinner: Random = Random(System.currentTimeMillis())
): State {
    override fun insertQuarter() {
        println("동전은 한 개만 넣어주세요.") // 이 상태에서는 부적절한 메서드
    }

    override fun ejectQuarter() {
        println("동전이 반환됩니다.")
        gumballMachine.setStatus(gumballMachine.noQuarterState)
    }

    override fun turnCrank() {
        println("손잡이를 돌리셨습니다.")
        val winner = randomWinner.nextInt(10)
        if((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setStatus(gumballMachine.winnerState)
        } else {
            gumballMachine.setStatus(gumballMachine.soldState)
        }
    }

    override fun dispense() {
        println("알맹이를 내보낼 수 없습니다.") // 이 상태에서는 부적절한 메서드
    }
}