package binarytreefindPath;

import java.util.ArrayList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    ArrayList<ArrayList<Integer>> listall = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || target < 0) {
            return listall;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.right == null && root.left == null) {
            // 只会执行一次，且遍历到最后list会为空。应该新建立一个Arraylist起到暂存的作用
            // listall.add(list);
            listall.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1); // 回溯作用，最后list为空
        return listall;
    }
}