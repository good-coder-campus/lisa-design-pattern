package designpattern.proxy.gumball

class GumballMonitor(
    private val machine: GumballMachine
) {
    fun report() {
        println("뽑기 기계 위치: ${machine.location}")
        println("현재 재고: ${machine.count}개")
        println("현재 상태: ${machine.state}")
    }
}