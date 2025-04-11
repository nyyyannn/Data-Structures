public class BST {
    Node root;
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(new Node(5));
        tree.insert(new Node(10));
        tree.insert(new Node(3));
        tree.insert(new Node(7));

        tree.display();

        tree.remove(5);
        System.out.println();

        tree.display();
    }
    public void insert(Node node)
    {
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node)
    {
        int data = node.data;
        if(root==null)
        {
            root = node;
            return root;
        }
        else if(root.data>data)
            root.left = insertHelper(root.left, node);
        else
            root.right = insertHelper(root.right, node);
        return root;
    }
    public void display()
    {
        displayHelper(root);
    }
    private void displayHelper(Node root)
    {
        if(root!=null)
        {
            displayHelper(root.left); //in-order traversal
            System.out.print(root.data+" ");
            displayHelper(root.right);
        }
    }
    public boolean search(int data)
    {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data)
    {
        if(root==null)
            return false;
        else if(root.data == data)
            return true;
        else if(root.data>data)
            return searchHelper(root.left, data);
        else
            return searchHelper(root.right, data);
    }
    public void remove(int data)
    {
        if(search(data))
        {
            removeHelper(root, data);
        }
        else
        {
            System.out.println(data+" could not be found.");
        }
    }
    public Node removeHelper(Node root, int data)
    {
        if(root==null)
            return root;
        else if(data<root.data)
            root.left = removeHelper(root.left, data);
        else if(data>root.data)
            root.right = removeHelper(root.right, data);
        else
        {
            if(root.left == null && root.right == null)
                root = null;
            else if(root.right!=null) //find in-order successor to replace this node
            {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else //find a in-order predecessor to replace this node
            {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root)
    {
        root = root.right;
        while(root.left!=null)
        {
            root=root.left;
        }
        return root.data;
    }
    private int predecessor(Node root)
    {
        root = root.left;
        while(root.right!=null)
        {
            root = root.right;
        }
        return root.data;
    }
}
class Node
{
    int data;
    Node right;
    Node left;

    public Node(int data)
    {
        this.data = data;
    }
}

