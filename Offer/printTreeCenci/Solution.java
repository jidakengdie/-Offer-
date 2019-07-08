package printTreeCenci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (pRoot == null) {
            return list;
        }
        int now = 1, next = 0;
        queue.offer(pRoot);
        while (queue.size() != 0) {
            TreeNode node = queue.poll();
            tmp.add(node.val);
            now--;
            if (node.left != null) {
                queue.offer(node.left);
                next++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                next++;
            }
            if (now == 0) {
                list.add(new ArrayList<>(tmp));
                now = next;
                next = 0;
                tmp.clear();
            }
        }
        return list;
    }
}