package designpattern.iterator

import kotlin.collections.Iterator

class DinerMenuIterator(
    private val items: Array<MenuItem> = emptyArray()
): Iterator<MenuItem> {
    private var position = 0

    override fun hasNext(): Boolean {
        return !(position >= items.size || items[position] == null)
    }

    override fun next(): MenuItem {
        val menuItem = items[position]
        position += 1
        return menuItem
    }
}