class Solution {
    public int maxArea(int[] he) {
        int maxarea = Integer.MIN_VALUE;
        int low = 0;
        int high = he.length-1;
        while(low<high){
            int h = Math.min(he[low],he[high]);
            int w = high-low;
            maxarea = Math.max(maxarea,(h*w));

            if(he[low]<=he[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxarea;
    }
}