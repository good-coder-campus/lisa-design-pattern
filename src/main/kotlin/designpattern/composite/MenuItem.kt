package designpattern.composite

data class MenuItem(
    val name: String,
    val description: String,
    val vegetarian: Boolean,
    val price: Double
): MenuComponent() {
    override fun print() {
        println("  $name")
        if (vegetarian) {
            println("(v)")
        }
        println(", $price")
        println("     -- $description")
    }
}
