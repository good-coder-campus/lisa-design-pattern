package designpattern.state

class GumballMachine {
    var soldOutState: State
    var noQuarterState: State
    var hasQuarterState: State
    var soldState: State
    var winnerState: State
    var state: State
    var count: Int
    constructor() {
        soldOutState = SoldOutState(this)
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)
        winnerState = WinnerState(this)
        state = soldOutState
        count = 0
    }
    constructor(numberGumballs: Int) : this() {
        this.count = numberGumballs
        state = if (count > 0) {
            noQuarterState
        } else {
            soldOutState
        }
    }

    fun setStatus(state: State) {
        this.state = state
    }

    fun insertQuarter() { // 동전 들어올 때 해야 할 일
        state.insertQuarter()
    }

    fun ejectQuarter() { // 도전 반환할 때 해야 할 일
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank() // 손잡이 돌아갔을 때 해야 할 일
        state.dispense() // 알맹이 내보낼 때 해야 할 일
    }

    fun releaseBall() {
        println("알맹이가 나가고 있습니다.")
        if (count != 0) {
            count -= 1
        }
    }
}