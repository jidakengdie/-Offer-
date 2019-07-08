package MergeList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    // public ListNode Merge(ListNode list1,ListNode list2) {
    // ListNode root, temp;
    // if(list1.val < list2.val){
    // root = new ListNode(list1.val);
    // list1 = list1.next;
    // }else{
    // root = new ListNode(list2.val);
    // list2 = list2.next;
    // }
    // temp = root;
    // while(list1!=null&&list2!=null){
    // if(list1.val < list2.val){
    // temp.next = new ListNode(list1.val);
    // list1 = list1.next;
    // }else{
    // temp.next = new ListNode(list2.val);
    // list2 = list2.next;
    // }
    // temp = temp.next;
    // }
    // if(list1.next!=null){
    // temp.next = list1;
    // list1 = list1.next;
    // }else{
    // temp.next = list2;
    // list2 = list2.next;
    // }
    // return root;
    // }
    public ListNode Merge(ListNode list1, ListNode list2) {
        // 新建一个头节点，用来存合并的链表。
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        // 把未结束的链表连接到合并后的链表尾部
        if (list1 != null) {
            head.next = list1;
        }
        if (list2 != null) {
            head.next = list2;
        }
        return root.next;
    }

    public ListNode CreateList(int n) {
        int i = 0;
        ListNode root = new ListNode(i);
        ListNode temp = root;
        while (i <= n) {
            i++;
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a1 = solution.CreateList(7);
        ListNode a2 = solution.CreateList(2);
        ListNode a3 = solution.Merge(a1, a2);
        while (a3.next != null) {
            System.out.println(a3.val);
            a3 = a3.next;
        }
    }
}