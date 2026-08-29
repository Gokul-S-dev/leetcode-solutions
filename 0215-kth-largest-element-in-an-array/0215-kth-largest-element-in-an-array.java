class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            max.offer(i);
        }
        for(int i=1;i<k;i++){
            max.poll();
        }
        return max.peek();
    }
}