import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        // balance = 0 before the array starts
        map.put(0, -1);

        int balance = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            // Treat 0 as -1
            if (nums[i] == 0) {
                balance--;
            } else {
                balance++;
            }

            // Same balance appeared before
            if (map.containsKey(balance)) {

                int length = i - map.get(balance);
                maxLength = Math.max(maxLength, length);

            } else {
                // Store first occurrence only
                map.put(balance, i);
            }
        }

        return maxLength;
    }
}