package designpattern.singleton.enum

enum class Singleton {
    UNIQUE_INSTANCE;

    fun getDescription(): String {
        return "I'm a thread safe Singleton!"
    }
}
