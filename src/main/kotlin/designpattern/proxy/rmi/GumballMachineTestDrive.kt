package designpattern.proxy.rmi

import java.lang.Exception
import java.rmi.Naming
import kotlin.system.exitProcess

class GumballMachineTestDrive

fun main(args: Array<String>) {

    if(args.size < 2) {
        println("뽑기 기계에 대한 인자를 입력해주세요.")
        exitProcess(1)
    }

    try {
        val count = Integer.parseInt(args[1])
        val gumballMachine = GumballMachine(args[0], count)

        Naming.rebind("//${args[0]}/gumballmachine", gumballMachine)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}