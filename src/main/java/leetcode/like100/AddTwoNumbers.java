package leetcode.like100;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

    public static void main(String[] args) {

        //l1 2,4,3
        //l2 5,6,4

        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        System.out.println(new Solution().addTwoNumbers(listNode1, listNode2));

        System.out.println(listNode1);

    }

}

//Time Complexity : O(max(m,n)), Space Complexity : O(max(m,n))
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        ListNode current = dummyHead;
        int carry = 0;
        while (l1Temp != null || l2Temp != null){
            int x = (l1Temp != null) ? l1Temp.val : 0;
            int y = (l2Temp != null) ? l2Temp.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;
            if(l1Temp != null) l1Temp = l1Temp.next;
            if(l2Temp != null) l2Temp = l2Temp.next;
        }

        if(carry > 0) current.next = new ListNode(carry);

        return dummyHead.next;
    }
}

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
