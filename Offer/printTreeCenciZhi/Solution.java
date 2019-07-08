package printTreeCenciZhi;

import java.util.ArrayList;
import java.util.Stack;

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
       Stack<TreeNode> s1 = new Stack<TreeNode>();
       Stack<TreeNode> s2 = new Stack<TreeNode>();
        if (pRoot == null) {
            return list;
        }
        s1.push(pRoot);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    TreeNode t =  s1.pop();
                    tmp.add(t.val);
                    if(t.left!=null){
                        s2.push(t.left);
                    }
                    if(t.right !=null){
                        s2.push(t.right);
                    }
                }
            }else{
                while(!s2.isEmpty()){
                    TreeNode t =  s2.pop();
                    tmp.add(t.val);
                    if(t.right!=null){
                        s1.push(t.right);
                    }
                    if(t.left !=null){
                        s1.push(t.left);
                    }
                }
            }
            list.add(new ArrayList<>(tmp));
            tmp.clear();
        }
        return list;
    }
}