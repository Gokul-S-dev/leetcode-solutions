class Solution {
    public void sortColors(int[] nums) {
        int mini;
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            mini=i;
            for(int j=i;j<n;j++){
                if(nums[j]<nums[mini]){
                    mini = j;
                }
            }
                int temp = nums[i];
                nums[i] = nums[mini];
                nums[mini] = temp;
        }
        
    }
}