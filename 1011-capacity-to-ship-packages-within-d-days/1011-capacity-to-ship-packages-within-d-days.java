class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        // Binary search for minimum capacity
        while (left < right) {

            int capacity = left + (right - left) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight > capacity) {
                    requiredDays++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            // Can ship within given days
            if (requiredDays <= days) {
                right = capacity;
            } 
            // Capacity is too small
            else {
                left = capacity + 1;
            }
        }

        return left;
    }
}