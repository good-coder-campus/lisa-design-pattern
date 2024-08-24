package designpattern.templatemethod.sort

import java.util.Arrays

class DuckSortTestDrive {
    companion object {
        fun display(ducks: Array<Duck>) {
            for (d in ducks) {
                println(d)
            }
        }
    }
}

fun main() {
    val ducks = arrayOf(
        Duck("Daffy", 8),
        Duck("Dewey", 2),
        Duck("Howard", 7),
        Duck("Louie", 2),
        Duck("Donald", 10),
        Duck("Huey", 2)
    )

    println("정렬 전:")
    DuckSortTestDrive.display(ducks)

    Arrays.sort(ducks)

    println("\n정렬 후:")
    DuckSortTestDrive.display(ducks)
}