package designpattern.adapter.duck

fun main(args: Array<String>) {
    val duck = MallardDuck()

    val turkey = WildTurkey()
    val turkeyAdapter = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    testDuck(duck)

    println("\nThe TurkeyAdapter says...")
    testDuck(turkeyAdapter)
}

private fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}
