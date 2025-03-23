import java.util.*;
public class QueueQ2 {

    private Queue<String> queue;

    public QueueQ2()
    {
        queue = new LinkedList<>();
    }

    public void enqueue(String customer)
    {
        queue.add(customer);
        System.out.println("Customer "+customer+" added to the queue.");
    }
    public void dequeue()
    {
        if(!queue.isEmpty())
        {
            System.out.println(queue.poll()+" served.");
        }
        else
        {
            System.out.println("Queue empty. No customer to serve");
        }
    }
    public void displayQueue()
    {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        QueueQ2 customers = new QueueQ2();

        customers.enqueue("Arun");
        customers.enqueue("Adi");
        customers.enqueue("Benny");

        customers.displayQueue();

        customers.dequeue();
        customers.dequeue();
        customers.dequeue();
        customers.dequeue();
        customers.dequeue();
    }
}
