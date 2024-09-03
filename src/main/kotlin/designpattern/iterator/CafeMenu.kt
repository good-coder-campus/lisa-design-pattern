package designpattern.iterator

import kotlin.collections.Iterator

data class CafeMenu(
    val menuItems: MutableMap<String, MenuItem> = mutableMapOf()
): Menu {
    init {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99)
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69)
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems[name] = menuItem
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.values.iterator()
    }
}
