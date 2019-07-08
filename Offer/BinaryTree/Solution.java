package BinaryTree;

class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        TreeNode root = new TreeNode(pre[preStart]);
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        for (int i = inStart; i <= inEnd; i++) {
            if (pre[preStart] == in[i]) {
                // root.left = reConstructBinaryTree(pre, preStart + 1, preStart + i, in,
                // inStart, i-1); //计算左子树时发生错误
                // root.right = reConstructBinaryTree(pre, preStart + i + 1, preEnd, in, i+1,
                // inEnd);
                root.left = reConstructBinaryTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
                root.right = reConstructBinaryTree(pre, preStart + i + 1 - inStart, preEnd, in, i + 1, inEnd);
            }
        }
        return root;
    }

    // public static void main(String[] args) {
    // int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
    // int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
    // Solution solution = new Solution();
    // solution.reConstructBinaryTree(pre, in);
    // }
}