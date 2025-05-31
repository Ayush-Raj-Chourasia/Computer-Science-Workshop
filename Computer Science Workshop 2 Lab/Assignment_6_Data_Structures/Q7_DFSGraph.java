import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Q7_DFSGraph {
    private int vertices;
    private ArrayList<LinkedList<Integer>> adjacencyList;
    private boolean[] visited;

    public Q7_DFSGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>();
        this.visited = new boolean[vertices];
        
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void readGraph(Scanner scanner) {
        System.out.print("Enter number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            addEdge(source, destination);
        }
    }

    public void DFS(int startVertex) {
        // Reset visited array
        for (int i = 0; i < vertices; i++) {
            visited[i] = false;
        }

        System.out.println("\nDFS Traversal starting from vertex " + startVertex + ":");
        DFSUtil(startVertex);
        System.out.println();
    }

    private void DFSUtil(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Integer neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor);
            }
        }
    }

    public void displayGraph() {
        System.out.println("\nGraph Representation (Adjacency List):");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer vertex : adjacencyList.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        Q7_DFSGraph graph = new Q7_DFSGraph(vertices);

        // Read graph
        graph.readGraph(scanner);

        // Display graph
        graph.displayGraph();

        // Perform DFS from vertex 0
        graph.DFS(0);

        scanner.close();
    }
} 