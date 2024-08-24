package designpattern.templatemethod.hook

class BeverageHookTestDrive
fun main() {
    val tea = TeaWithHook()
    val coffee = CoffeeWithHook()

    println("\n차 준비 중")
    tea.prepareRecipe()

    println("\n커피 준비 중")
    coffee.prepareRecipe()
}
