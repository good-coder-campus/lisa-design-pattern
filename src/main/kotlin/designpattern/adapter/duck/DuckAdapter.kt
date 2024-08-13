package designpattern.adapter.duck

import kotlin.random.Random

class DuckAdapter(
    private val duck: Duck,
    private val rand: Random
): Turkey {
    override fun gobble() {
        duck.quack()
    }

    override fun fly() {
        if(rand.nextInt(5) == 0) {
            duck.fly()
        }
    }
}