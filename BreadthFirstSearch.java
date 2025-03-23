import java.util.*;
public class BreadthFirstSearch
{

    //Traverses a graph level by level
    //Utilizes a queue
    //Better if destination is on average close to start
    //Siblings are visited before children
    //More popular for games/puzzles
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

        graph.bfs(0);

    }
}
class GraphAdjacencyMatrix {
    ArrayList<Node> nodes;
    int matrix[][];

    public void bfs(int source)
    {
        boolean visited [] = new boolean[matrix.length];
        Queue <Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source]=true;
        while(queue.size()!=0)
        {
            source = queue.poll(); //assigning the source to be whatever is at the front of the queue
            System.out.println(nodes.get(source).data+"=visited");
            for(int i=0;i<matrix[source].length;i++)
            {
                if(!visited[i]&&matrix[source][i]==1)
                {
                    queue.offer(i);
                    visited[i]=true;
                }
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