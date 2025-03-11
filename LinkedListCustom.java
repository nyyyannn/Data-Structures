public class LinkedListCustom
{
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(5);
        list.insert(15);
        list.insert(25);
        list.insert(35);
        list.insert(45);
        list.show();
    }
}

class Linkedlist{
    Node head; //by default value for this node is null
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null; //by default it is null but add it for readability
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n = head; // for traversing and finding the last node
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show()
    {
        Node n = head;
        while(n.next!=null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

class Node
{
    int data;
    Node next;
}
