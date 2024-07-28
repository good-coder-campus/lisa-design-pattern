package designpattern.singleton.chocolate

object ChocolateBoiler {
    private var empty: Boolean = true
    private var boiled: Boolean = false

    fun getInstance(): ChocolateBoiler {
        return this
    }

    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true
        }
    }

    fun boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true
        }
    }

    fun isEmpty(): Boolean {
        return empty
    }

    fun isBoiled(): Boolean {
        return boiled
    }
}
