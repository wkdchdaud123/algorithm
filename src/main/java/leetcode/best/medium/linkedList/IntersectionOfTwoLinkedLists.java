package leetcode.best.medium.linkedList;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode intersection_3 = new ListNode(5);
        ListNode intersection_2 = new ListNode(4);
        ListNode intersection = new ListNode(8);

        ListNode listA_2 = new ListNode(1);
        ListNode listA = new ListNode(4);

        ListNode listB_3 = new ListNode(1);
        ListNode listB_2 = new ListNode(6);
        ListNode listB = new ListNode(5);

        listA.next = listA_2;
        listA_2.next = intersection;
        intersection.next = intersection_2;
        intersection_2.next = intersection_3;


        listB.next = listB_2;
        listB_2.next = listB_3;
        listB_3.next = intersection;
        intersection.next = intersection_2;
        intersection_2.next = intersection_3;


        ListNode listNode = new IntersectionOfTwoLinkedLists().getIntersectionNode(listA, listB);
        System.out.println(listNode);
    }

    // Time Complexity: O(N x M)
    // Space Complexity: O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode pB = headB;
            while (pB != null) {
                if (headA == pB) {
                    return headA;
                }
                pB = pB.next;
            }
            headA = headA.next;
        }
        return null;
    }

}
