This repository demonstrates an uncommon behavior of the `removeIf` function in Kotlin when used with `MutableList` and `MutableSet`. The `removeIf` function iterates through the collection and removes elements that satisfy the given predicate. However, when modifying the collection during iteration, it can lead to unexpected results depending on the collection type.

The `bug.kt` file shows how `removeIf` behaves differently with lists and sets.  The `bugSolution.kt` file proposes using an iterator or creating a new collection for correct and consistent behavior.

This is a subtle but important detail when working with Kotlin collections.