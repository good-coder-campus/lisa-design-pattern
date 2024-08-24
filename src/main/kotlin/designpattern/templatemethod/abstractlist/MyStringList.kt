package designpattern.templatemethod.abstractlist

class MyStringList(
    private val myList: Array<String>,
) : AbstractList<String>() {
    override val size: Int
        get() = myList.size

    override fun get(index: Int): String {
        return myList[index]
    }

    fun set(index: Int, value: String): String {
        val oldString = myList[index]
        myList[index] = value
        return oldString
    }
}

fun main() {
    val ducks = arrayOf(
        "Mallard Duck",
        "Redhead Duck",
        "Rubber Duck",
        "Decoy Duck"
    )

    val ducksList = MyStringList(ducks)
    val ducksSubList = ducksList.subList(2, 3)
    println("ducksSubList = $ducksSubList")
}