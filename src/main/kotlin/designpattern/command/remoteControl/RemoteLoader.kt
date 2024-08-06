package designpattern.command.remoteControl

class RemoteLoader {
    fun main() {
        val remoteControl = RemoteControl()
        val livingRoomLight = Light("Living Room")
        remoteControl.setCommand(0, { livingRoomLight.on() }) { livingRoomLight.off() }
    }
}