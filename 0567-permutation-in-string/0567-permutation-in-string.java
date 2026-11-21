class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freq1 = new int[26];
        int [] freq2 = new int[26];

        for(Character i : s1.toCharArray()){
            freq1[i-'a']++;
        }

        int low=0;
        for(int high=0;high<s2.length();high++){
            freq2[s2.charAt(high)-'a']++;
            if((high-low)+1 > s1.length()){
                freq2[s2.charAt(low)-'a']--;
                low++;
            }
            if((high-low)+1 == s1.length()){
                boolean isMatch= true;
                for(int i=0;i<26;i++){
                    if(freq1[i]!=freq2[i]){
                        isMatch=false;
                        break;
                    }
                }
                if(isMatch) return true;
            }
        }

        return false;
        
    }
}