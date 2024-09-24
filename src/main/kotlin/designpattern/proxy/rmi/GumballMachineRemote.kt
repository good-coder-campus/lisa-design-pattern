package designpattern.proxy.rmi

import java.rmi.Remote
import java.rmi.RemoteException

interface GumballMachineRemote: Remote {
    @Throws(RemoteException::class)
    fun getCount(): Int

    @Throws(RemoteException::class)
    fun getLocation(): String

    @Throws(RemoteException::class)
    fun getState(): State
}