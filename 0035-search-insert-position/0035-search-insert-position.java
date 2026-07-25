class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n;
        while(i<n && nums[i] < target){
            i++;
        }
        return i;
    }
}