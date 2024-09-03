package designpattern.composite

data class Waitress(
    val allMenus: MenuComponent
) {
    fun printMenu() {
        allMenus.print()
    }
}
