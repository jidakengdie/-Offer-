package treeDepth;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    private int max = 0;
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        treeDepth(root, depth);
        return max;
    }

    private void treeDepth(TreeNode root, int depth) {
        if (root.right == null && root.left == null) {
            max = maxNum(max, depth);
        }
        if (root.left != null) {
            treeDepth(root.left, depth + 1);
        }
        if (root.right != null) {
            treeDepth(root.right, depth + 1);
        }
    }

    private int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}