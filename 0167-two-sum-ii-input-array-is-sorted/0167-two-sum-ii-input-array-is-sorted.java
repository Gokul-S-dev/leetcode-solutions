class Solution {
    public int[] twoSum(int[] n, int target) {
        int low=0;
        int high= n.length-1;

        while(low<high){
            int sum=n[low]+n[high];
            if(sum==target){
                return new int []{++low,++high};
            }
            else if(sum<target){
                low++;
            }else{
                high--;
            }
        }

        return new int[]{-1,-1};
        
    }
}