package designpattern.command.undo

class RemoteLoader {
    fun main() {
        val remoteControl = RemoteControlWithUndo()
        val livingRoomLight = Light("Living Room")
        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        remoteControl.undoButtonWasPushed()
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(0)

    }
}