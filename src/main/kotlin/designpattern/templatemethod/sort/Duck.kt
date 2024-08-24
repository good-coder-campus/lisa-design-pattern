package designpattern.templatemethod.sort

data class Duck(
    val name: String,
    val weight: Int
): Comparable<Duck> {
    override fun toString(): String {
        return "$name 체중: $weight"
    }
    override fun compareTo(other: Duck): Int {
        return if (this.weight < other.weight) {
            -1
        } else if (this.weight == other.weight) {
            0
        } else {
            1
        }
    }
}