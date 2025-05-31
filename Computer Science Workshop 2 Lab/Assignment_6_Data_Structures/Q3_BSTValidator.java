class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Q3_BSTValidator {
    public boolean isBST(TreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return isBSTUtil(node.left, min, node.val) && 
               isBSTUtil(node.right, node.val, max);
    }

    public static void main(String[] args) {
        Q3_BSTValidator validator = new Q3_BSTValidator();

        // Create a valid BST
        TreeNode validBST = new TreeNode(50);
        validBST.left = new TreeNode(30);
        validBST.right = new TreeNode(70);
        validBST.left.left = new TreeNode(20);
        validBST.left.right = new TreeNode(40);
        validBST.right.left = new TreeNode(60);
        validBST.right.right = new TreeNode(80);

        // Create an invalid BST
        TreeNode invalidBST = new TreeNode(50);
        invalidBST.left = new TreeNode(30);
        invalidBST.right = new TreeNode(70);
        invalidBST.left.left = new TreeNode(20);
        invalidBST.left.right = new TreeNode(60); // This makes it invalid
        invalidBST.right.left = new TreeNode(40);
        invalidBST.right.right = new TreeNode(80);

        System.out.println("Is validBST a BST? " + validator.isBST(validBST));
        System.out.println("Is invalidBST a BST? " + validator.isBST(invalidBST));
    }
} 