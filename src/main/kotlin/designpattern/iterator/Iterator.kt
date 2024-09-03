package designpattern.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem
}