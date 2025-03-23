import java.util.*;
public class GraphAdjacencyMatrix {
    ArrayList<Node> nodes;
    int matrix[][];
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
