package designpattern.iterator

import kotlin.collections.Iterator

interface Menu {
    fun createIterator(): Iterator<MenuItem>
}