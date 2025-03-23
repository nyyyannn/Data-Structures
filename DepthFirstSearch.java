import java.util.*;
public class DepthFirstSearch
{
    //Traverses a graph branch by branch
    //Utilizes a stack
    //Better if destination is on average far from the start
    //Children are visited before siblings

    public static void main(String[] args) {
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4, 2);

        graph.print();
        graph.dfs(2);
    }
}
class GraphAdjacencyMatrix {
    ArrayList<Node> nodes;
    int matrix[][];

    public void dfs(int source)
    {
        boolean visited[]=new boolean[matrix.length];
        dfsHelper(source, visited);
    }
    public void dfsHelper(int source, boolean visited[])
    {
        if(visited[source])
        {
            return;
        }
        else{
            visited[source]=true;
            System.out.println(nodes.get(source).data+"=visited");
        }
        for(int i=0;i<matrix[source].length;i++) //this one calculates the nodes that can be visited by source.
        {
            if(matrix[source][i]==1)
            {
                dfsHelper(i, visited); //calling again to explore the new node, source is the new node
            }
        }
    }
    

    GraphAdjacencyMatrix(int size)
    {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node)
    {
        nodes.add(node);
    }
    public void addEdge(int source, int destination)
    {
        matrix[source][destination] = 1;
    }
    public boolean checkEdge(int source, int destination)
    {
        if(matrix[source][destination]==1) return true;
        else return false;
    }
    public void print()
    {
        System.out.print("  ");
        for(Node node:nodes)
        {
            System.out.print(node.data+" ");
        }
        System.out.println();
        for(int i=0;i<matrix.length;i++)
        {
            System.out.print(nodes.get(i).data+" ");
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Node
{
    char data;
    Node(char data)
    {
        this.data = data;
    }
}