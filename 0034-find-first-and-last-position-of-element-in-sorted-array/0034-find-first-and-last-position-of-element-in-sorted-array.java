class Solution {
    public int firstOc(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }

    public int lastOc(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOc(nums,target);
        int last = lastOc(nums,target);

        return new int[]{first,last};
    }
}