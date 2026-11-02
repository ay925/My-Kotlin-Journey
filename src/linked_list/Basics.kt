package linked_list

class Node(val data: Int, var next: Node?=null)

class LinkedList (var head: Node?=null, var tail:Node?=null) {

    fun display(){
        var temp: Node? =head

        while (temp !=null) {
            print("${temp.data} ")
            temp = temp.next
        }
    }

    fun size(): Int{
        var temp: Node? =head
        var count =0

        while (temp!=null){
            count++
            temp=temp.next
        }
        return count
    }

    fun addAtEnd(value:Int){
        val temp = Node(value)
        if (head ==null){
            head =temp
        } else{
            tail?.next =temp
        }
        tail=temp
    }
    fun addAtBeginning(value: Int) {
        val temp = Node(value)
        if (head ==null){
            addAtEnd(value)
        } else{
            temp.next =head
            head=temp
        }
    }
}

fun main(){
    val l = LinkedList()
    l.addAtEnd(5)
    l.addAtEnd(10)
    l.display()
    println()
    println(l.size())
    l.addAtBeginning(25)
    l.display()
    println()
}