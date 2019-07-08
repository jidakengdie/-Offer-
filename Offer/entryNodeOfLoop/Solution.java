package entryNodeOfLoop;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = p1;
        while(p1!=null && p1.next !=null){
            p1 = p1.next.next;
            p2 = p2.next;
            if(p1 == p2){
                p1 = pHead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}