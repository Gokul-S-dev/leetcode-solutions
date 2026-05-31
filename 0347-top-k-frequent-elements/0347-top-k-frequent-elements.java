class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frq =new HashMap<>();

        for(int num: nums){
            frq.put(num, frq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq =new PriorityQueue<>(
            (a,b)->frq.get(b)-frq.get(a)
        );

        pq.addAll(frq.keySet());
        int [] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll();
        }
        return result;
    }
}