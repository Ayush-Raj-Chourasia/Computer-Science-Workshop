import java.util.ArrayList;
import java.util.LinkedList;

public class Q6_GraphRepresentation {
    private int vertices;
    private int[][] adjacencyMatrix;
    private ArrayList<LinkedList<Integer>> adjacencyList;

    public Q6_GraphRepresentation(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
        this.adjacencyList = new ArrayList<>();
        
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        // Add edge to adjacency matrix
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;

        // Add edge to adjacency list
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void displayAdjacencyMatrix() {
        System.out.println("\nAdjacency Matrix:");
        System.out.print("  ");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayAdjacencyList() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer vertex : adjacencyList.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q6_GraphRepresentation graph = new Q6_GraphRepresentation(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display both representations
        graph.displayAdjacencyMatrix();
        graph.displayAdjacencyList();
    }
} 