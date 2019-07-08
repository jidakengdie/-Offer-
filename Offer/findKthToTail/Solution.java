package findKthToTail;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution{
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode temp = head;
        if(head == null){
            return null;
        }
        while(k>1&&head.next != null){
            k--;
            head = head.next;
        }
        if(k!=1)return null;
        while(head.next !=null){
            temp = temp.next;
            head = head.next;
        }
        return temp;
    }
    // public static void main(String[] args) {
    //     int n=6;
    //     ListNode root = new ListNode(n);
    //     ListNode temp = root;
    //     while(n>0){
    //         n--;
    //         ListNode listNode = new ListNode(n);
    //         temp.next = listNode;
    //         temp = temp.next;
    //     }
    //     temp.next = null;
    //     Solution solution = new Solution();
    //     System.out.println(solution.FindKthToTail(root, 8).val);
    // }
}