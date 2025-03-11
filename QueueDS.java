import java.util.*;
public class QueueDS
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>(); //Queue is an interface and hence the reason we use linkedlist to represent queues.

        System.out.println(queue.isEmpty());

        queue.offer("James");
        queue.offer("Steve"); //adding elements to the queue
        queue.offer("John");
        queue.offer("Mary");
        
        System.out.println(queue.size()); //size of the queue

        System.out.println(queue.peek()); //returns the head of the queue

        System.out.println(queue.contains("Steve")); //returns true or false

        // System.out.println(queue);
        queue.poll(); //dequeues the element at the head of the queue
        // System.out.println(queue); 

        System.out.println(queue);

        //where are queue useful?
        //1.Keyboard Buffer (letters appear on the screen in the order in which they're presented)
        //2.Printer Queue (Print jobs should be completed in order)
        //3. Used in LinkedLists, PriorityQueues, Breadth-First-Search
    }
}