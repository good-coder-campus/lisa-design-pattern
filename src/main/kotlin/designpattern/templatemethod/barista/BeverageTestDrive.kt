package designpattern.templatemethod.barista

class BeverageTestDrive {
    fun main() {
        val tea = Tea()
        val coffee = Coffee()

        println("\n차 준비 중")
        tea.prepareRecipe()

        println("\n커피 준비 중")
        coffee.prepareRecipe()
    }
}