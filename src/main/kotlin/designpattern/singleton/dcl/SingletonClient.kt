package designpattern.singleton.dcl

import designpattern.singleton.classic.Singleton

class SingletonClient {
    fun main() {
        val instance = Singleton.getInstance()
    }
}