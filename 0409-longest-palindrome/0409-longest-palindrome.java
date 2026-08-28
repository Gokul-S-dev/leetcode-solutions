class Solution {
    public int longestPalindrome(String s) {
        int [] freq = new int[127];
        for(char c:s.toCharArray()){
            freq[c]++;
        }

        boolean hasOdd= false;
        int length =0;
        for(int i: freq){
            length+=(i/2)*2;
            if(i%2==1){
                hasOdd=true;
            }
        }
        if(hasOdd){
            return 1+length;
        }
        return length;
    }
}