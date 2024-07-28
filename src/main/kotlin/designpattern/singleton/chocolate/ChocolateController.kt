package designpattern.singleton.chocolate

class ChocolateController {
    fun main() {
        val boiler = ChocolateBoiler.getInstance()
        boiler.fill()
        boiler.boil()
        boiler.drain()

        val boiler2 = ChocolateBoiler.getInstance()
    }
}