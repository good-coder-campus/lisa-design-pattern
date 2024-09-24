package designpattern.proxy.gumball

interface State {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()
}