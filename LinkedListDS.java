import java.util.*;
public class LinkedListDS {
    public static void main(String[] args) { 
        //contains a long chain of nodes, each node contains 2 pieces of information: data and address to the next node in the list

        //Advantage: Better for insertion and deletion.
        //Disadvantage: Finding elements would require traversing the entire LinkedList.
        
        LinkedList<String> linkedList = new LinkedList<String>();
        
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4,"E"); //adding "E" at the 4th index, (indexing starts from 0)
        linkedList.remove("E"); //removes E

        System.out.println(linkedList.peekFirst()); //head of the linkedList
        System.out.println(linkedList.peekLast()); //tail of the linkedList
        linkedList.addFirst("0");//adds element before the head
        linkedList.addLast("G");//adds element after the tail
        String first = linkedList.removeFirst(); //removes the head ("0")
        String last = linkedList.removeLast(); //removes the tail ("G")


        System.out.println(linkedList);

    }
}
