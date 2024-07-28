package designpattern.singleton.stat


class Singleton {
    private constructor() {}

    fun getDescription(): String {
        return "I'm a statically initialized Singleton!"
    }

    companion object {
        private val instance: Singleton = Singleton()

        fun getInstance(): Singleton {
            return instance
        }
    }
}