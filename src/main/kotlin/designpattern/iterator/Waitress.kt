package designpattern.iterator

import kotlin.collections.Iterator

data class Waitress(
    val pancakeHouseMenu: Menu,
    val dinerMenu: Menu,
    val cafeMenu: Menu,
) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()
        val cafeIterator = cafeMenu.createIterator()

        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
        println("\nDINNER")
        printMenu(cafeIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}
