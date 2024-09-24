package designpattern.proxy.rmi

import java.rmi.RemoteException

class GumballMonitor(
    private val machine: GumballMachineRemote
) {
    fun report() {
        try {
            println("뽑기 기계 위치: ${machine.getLocation()}")
            println("현재 재고: ${machine.getCount()}개")
            println("현재 상태: ${machine.getState()}")
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }
}