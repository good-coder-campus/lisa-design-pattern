package designpattern.proxy.rmi

import java.rmi.Naming

class GumballMonitorTestDrive

fun main() {
    val locations = listOf(
        "rmi://santafe.mightygumball.com/gumballmachine",
        "rmi://boulder.mightygumball.com/gumballmachine",
        "rmi://austin.mightygumball.com/gumballmachine"
    )

    val monitor = mutableListOf<GumballMonitor>()

    locations.forEach {
        try {
            val machine = Naming.lookup(it) as GumballMachineRemote
            monitor.add(GumballMonitor(machine))
            println(monitor.last().report())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    monitor.forEach {
        println(it.report())
    }
}