package designpattern.singleton.threadsafe

class Singleton {
    private constructor()

    fun getDescription(): String {
        return "I'm a statically initialized Singleton!"
    }

    companion object {
        private var instance: Singleton? = null

        @Synchronized
        fun getInstance(): Singleton {
            if (instance == null) {
                instance = Singleton()
            }
            return instance!!
        }
    }
}