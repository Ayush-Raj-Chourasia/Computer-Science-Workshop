class BSTNode {
    int key;
    BSTNode left;
    BSTNode right;

    public BSTNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class Q5_BSTDeletion {
    private BSTNode root;

    public Q5_BSTDeletion() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private BSTNode insertRec(BSTNode node, int key) {
        if (node == null) {
            return new BSTNode(key);
        }

        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        }

        return node;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private BSTNode deleteRec(BSTNode node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.key) {
            node.right = deleteRec(node.right, key);
        } else {
            // Case 1: Node with no children
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: Node with one child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Case 3: Node with two children
            else {
                BSTNode successor = findMin(node.right);
                node.key = successor.key;
                node.right = deleteRec(node.right, successor.key);
            }
        }
        return node;
    }

    private BSTNode findMin(BSTNode node) {
        BSTNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void inOrderTraversal() {
        System.out.print("In-order traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(BSTNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.key + " ");
            inOrderRec(node.right);
        }
    }

    public static void main(String[] args) {
        Q5_BSTDeletion tree = new Q5_BSTDeletion();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Original BST:");
        tree.inOrderTraversal();

        // Test Case 1: Delete leaf node
        System.out.println("\nDeleting leaf node (20):");
        tree.delete(20);
        tree.inOrderTraversal();

        // Test Case 2: Delete node with one child
        System.out.println("\nDeleting node with one child (70):");
        tree.delete(70);
        tree.inOrderTraversal();

        // Test Case 3: Delete node with two children
        System.out.println("\nDeleting node with two children (30):");
        tree.delete(30);
        tree.inOrderTraversal();
    }
} 