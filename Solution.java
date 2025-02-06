class ListNode{
int val;
ListNode next;
ListNode(int val) {
  this.val = val;
}
ListNode(int val,ListNode next) {
  this.val = val;
  this.next = next;
}
}

public class Solution {
  private static ListNode removeElements(ListNode l1, int val) {
    ListNode dummy = new ListNode(0);
    dummy.next = l1;
    if(l1==null) return null;
    while(l1.next!=null) {
      if(l1.next.val == val) {
        l1.next = l1.next.next;
      }
      else{
        l1 = l1.next;
      }
    }return dummy.next;
  }

public static void main(String[] manu) {
  ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4))));
  ListNode rm = removeElements(l1,3);
  while(l1!=null) {
    System.out.print(l1.val+" ");  
    l1=l1.next;
}
}
}
