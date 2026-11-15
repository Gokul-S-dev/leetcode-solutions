class Solution {
    public boolean validPalindrome(String s) {
        int low=0;
        int high = s.length()-1;
        while(low<=high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                return isPali(s,low,high-1) || isPali(s,low+1,high);
            }
        }
        return true;
    }

    public boolean isPali(String s, int low, int high){
        while(low<=high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}