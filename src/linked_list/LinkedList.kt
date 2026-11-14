package linked_list


class Node(val data: Int, var next: Node?=null)


class LinkedList(val head: Node) {

    fun display() {
        var temp: Node? = head
        while (temp!= null){

            // printing data
            print(temp.data)

            //printing arrow
            if (temp.next!=null) print(" -> ")

            temp =temp.next
        }
        println()
    }

    fun displayRecursion(temp: Node? = head) {
        if (temp==null) {
            println()
            return
        }
        print(temp.data)
        if (temp.next!=null) print(" -> ")
        displayRecursion(temp.next)
    }

    fun length(): Int {
        var temp:Node?=head
        var count =0;

        while (temp!=null){
            count++
            temp=temp.next
        }
        return count

    }
}

fun main(){

    // Create Node
    val a = Node(13)
    val b = Node(22)
    val c = Node(31)
    val d = Node(42)
    val e = Node(25)

    // Connect Node
    a.next=b
    b.next=c
    c.next=d
    d.next=e

    val linkedList = LinkedList(a)

//    linkedList.display()
    linkedList.display()

    println(linkedList.length())


}