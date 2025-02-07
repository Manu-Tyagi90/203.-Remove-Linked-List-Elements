class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    private static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return dummy.next;
    }

    public static void main(String[] manu) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode rm = removeElements(l1, 3);
        
        while (rm != null) {
            System.out.print(rm.val + " ");
            rm = rm.next;
        }
    }
}
