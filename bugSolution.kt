fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it % 2 != 0 }.toMutableSet()
    println(newSet) // Output: [1, 3, 5]
} 