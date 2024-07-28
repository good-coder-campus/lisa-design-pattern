package designpattern.singleton.stat

class SingletonClient {
    fun main() {
        val instance = Singleton.getInstance()
        println("instance.getDescription() = ${instance.getDescription()}")
    }
}