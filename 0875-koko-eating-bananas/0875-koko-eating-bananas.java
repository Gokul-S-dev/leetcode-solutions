class Solution {
    public boolean checkAns(int []arr, int h, long mid){
        long time = 0;
        for(int i:arr){
            if(i%mid==0){
                time += i/mid;
            }else{
                time+= (i/mid)+1;
            }
        }
            return time <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i: piles){
            if(i>max) max = i;
        }
        long l = 1, r = max;
        long ans = Integer.MAX_VALUE;
        while(l<=r){
            long mid = (long)l+(r-l)/2;
            if(checkAns(piles,h,mid)){
                ans = Math.min(ans,mid);
                r= mid-1;
            }else{
                l = mid+1;
            }
        }
        return (int)ans;
    }
}