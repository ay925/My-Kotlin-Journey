package DSA.Classes

class Node(var value: Int) {
    var next: Node? = null
}
    class SinglyLinkedList {

        var head: Node? = null

        fun append(value: Int) {

            val newNode = Node(value)

            if (head == null) {
                head = newNode
            }
            else{
                var curr=head
                while (curr?.next !=null){
                    curr=curr.next
                }
                curr?.next=newNode
            }
            }

        fun traversal(){
            if (head==null){
                println("SLL is empty")
            }else{
                var curr=head
                while (curr !=null){
                    print("${curr.value} ")
                    curr=curr.next
                }
            }
        }
        fun insert(value:Int, position:Int){
            val newNode= Node(value)
            if (position==0){
                newNode.next=head
                head=newNode
            }
        }

    }

fun main() {
    /*
    val node1 = Node(4)
    val node2 = Node(10)
    val node3 = Node(50)
    val node4 = Node(20)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    println(node1.next?.next?.next?.value ?: 0)
    */

    val sll= SinglyLinkedList()
    sll.append(2)
    sll.append(4)
    sll.append(6)
    sll.append(8)
    sll.append(12)
    sll.traversal()
}