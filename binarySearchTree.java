class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}

public class binarySearchTree {
    public static void main(String[] args) {
        // Creating a sample BST
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

        Solution sol = new Solution();

        int searchValue = 6;
        TreeNode result = sol.searchBST(root, searchValue);

        if (result != null) {
            System.out.println("Node found: " + result.val);
        } else {
            System.out.println("Value not found in BST.");
        }
    }
}

