package designpattern.singleton.enum

class SingletonClient {
    fun main() {
        val singleton = Singleton.UNIQUE_INSTANCE
        println("singleton.getDescription() = ${singleton.getDescription()}")
    }
}