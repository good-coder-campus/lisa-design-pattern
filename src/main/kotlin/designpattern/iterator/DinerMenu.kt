package designpattern.iterator

import kotlin.collections.Iterator

data class DinerMenu(
    var numberOfItems: Int = 0,
    private val MAX_ITEMS: Int = 6,
    val menuItems: Array<MenuItem>
) {
    fun createIterator(): Iterator<MenuItem> {
        return DinerMenuIterator(menuItems)
    }
}
