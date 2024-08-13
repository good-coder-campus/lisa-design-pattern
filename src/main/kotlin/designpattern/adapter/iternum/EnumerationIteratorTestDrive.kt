package designpattern.adapter.iternum

import java.util.*

class EnumerationIteratorTestDrive

fun main(args: Array<String>) {
    val enumeration = Vector(args.toList())
    val iterator = EnumerationIterator(enumeration.elements())
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}