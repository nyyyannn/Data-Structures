import java.util.*;
public class PriorityQueuesDS {

    //A fifo data structure that serves elements with the highest priority first before elements with lower priority
    public static void main(String[] args) {
        Queue <String> priorityQueue = new PriorityQueue<>(); //arranges in ascending order (to make it sort in descending order, we pass Collections.reverseOrder() to the constructor)
        // Queue <Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder())

        priorityQueue.offer("B");
        priorityQueue.offer("A");
        priorityQueue.offer("F");
        priorityQueue.offer("C");

        while(!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll());
        }
    }
}
