package mirrorBinaryTree;

class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode() {
    }
}

class Solution {
    public void Mirror(TreeNode root) {
        TreeNode temp;
        if(root ==null)return;
        if (root != null) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    //     TreeNode root = new TreeNode();
    //     Solution solution = new Solution();
    //     solution.Mirror(root);
    // }
}