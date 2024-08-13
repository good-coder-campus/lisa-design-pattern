package designpattern.adapter.duck

class TurkeyAdapter(
    private val turkey: Turkey
): Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        (0..5).forEach { _ ->
            turkey.fly()
        }
    }
}