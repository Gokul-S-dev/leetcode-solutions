class Solution {
    public boolean reqTime(int[] piles, int mid, int h){
        long total = 0;
        for(int i:piles){
            total+= (i + mid - 1) / mid;
        }

        return total <=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxi = Integer.MIN_VALUE;
        for(int i:piles){
            maxi = Math.max(maxi,i);
        }
        int low = 1;
        int high = maxi;
        while(low<=high){
            int mid = low+((high-low)/2);

            if(reqTime(piles,mid,h)){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
            
        }
    }