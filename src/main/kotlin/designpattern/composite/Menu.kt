package designpattern.composite

data class Menu(
    val name: String,
    val description: String,
    val menuComponents: MutableList<MenuComponent> = mutableListOf(),
): MenuComponent() {
    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun print() {
        println("\n$name, $description")
        println("---------------------")

        for(menuComponent in menuComponents) {
            menuComponent.print()
        }
    }
}
