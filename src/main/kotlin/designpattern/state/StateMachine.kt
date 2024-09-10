package designpattern.state

class StateMachine (
    var state: Int = SOLD_OUT
) {
    companion object {
        val SOLD_OUT = 0
        val NO_QUARTER = 1
        val HAS_QUARTER = 2
        val SOLD = 3
    }
    fun insertQuarter() {
        when (state) {
            HAS_QUARTER -> {
                println("동전은 한 개만 넣어주세요.")
            }
            NO_QUARTER -> {
                state = HAS_QUARTER
                println("동전을 넣으셨습니다.")
            }
            SOLD_OUT -> {
                println("매진되었습니다. 다음 기회에 이용해주세요.")
            }
            SOLD -> {
                println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.")
            }
        }

    }
}