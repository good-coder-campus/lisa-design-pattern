package designpattern.proxy.rmi

class SoldOutState() : State {
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