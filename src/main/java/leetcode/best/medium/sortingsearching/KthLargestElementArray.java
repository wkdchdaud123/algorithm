package leetcode.best.medium.sortingsearching;

import java.util.PriorityQueue;

public class KthLargestElementArray {

    //Input: nums = [3,2,1,5,6,4], k = 2
    public static void main(String[] args) {

        new KthLargestElementArray().findKthLargest(new int[]{3,2,1,5,6,4}, 2);

    }

    public int findKthLargest(int[] nums, int k) {
        // init heap 'the smallest element first'
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        System.out.println(heap);
        System.out.println(heap.toString().hashCode());
        System.out.println(heap.hashCode());

        // keep k largest elements in the heap
        for (int n: nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        // output
        return heap.poll();
    }

}
