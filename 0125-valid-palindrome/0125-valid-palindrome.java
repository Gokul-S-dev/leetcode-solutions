class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int low = 0;
        int high = s.length()-1;
        while(low<=high){
            if(s.charAt(low)-'0'!=s.charAt(high)-'0'){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}