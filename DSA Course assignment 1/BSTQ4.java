public class BSTQ4 {
    private Node root;

    public Node insertRollNumber(Node root, int val)
    {
        if(root==null)
            return new Node(val);
        if(val<root.val)
            root.left = insertRollNumber(root.left, val);
        else if(val>root.val)
            root.right = insertRollNumber(root.right, val);
        return root;
    }

    public void insert(int val)
    {
        root = insertRollNumber(root, val);
    }

    public boolean search(int val)
    {
        return searchRoll(root, val);
    }

    public boolean searchRoll(Node root, int rollNumber)
    {
        if(root==null)
            return false;
        if(root.val==rollNumber)
        {
            return true;
        }
        return rollNumber < root.val ? searchRoll(root.left, rollNumber) : searchRoll(root.right, rollNumber);
    }
    public static void main(String[] args) {
        
        BSTQ4 test = new BSTQ4();

        int [] rollNumbers = {20,40,10,15,5,40,60,80};
        for(int roll: rollNumbers)
            test.insert(roll);

        System.out.println("Search 50: "+test.search( 20));
        System.out.println("Search 2: "+test.search(2));

    }
}

class Node
{
    public int val;
    Node left, right;
    Node(int val)
    {
        this.val = val;
        left=right=null;
    }
}
