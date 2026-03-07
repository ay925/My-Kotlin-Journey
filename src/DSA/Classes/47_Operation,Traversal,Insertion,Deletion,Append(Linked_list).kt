package DSA.Classes

class Node(var value: Int) {
    var next: Node? = null
}

fun main() {

    val node1 = Node(4)
    val node2 = Node(10)
    val node3 = Node(50)
    val node4 = Node(20)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    println(node1.next?.next?.next?.value ?: 0)
}