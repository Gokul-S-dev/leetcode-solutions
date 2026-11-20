class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int high=0;
        int maxfreq =0;
        int maxlen=0;
        int []hash = new int[26];
        while(high<s.length()){
            hash[s.charAt(high)-'A']++;
            maxfreq = Math.max(maxfreq,hash[s.charAt(high)-'A']);

            while((high-low+1)-maxfreq > k){
                hash[s.charAt(low)-'A']--;
                maxfreq=0;
                for(int i=0;i<26;i++){
                    maxfreq = Math.max(maxfreq,hash[i]);   
                }               
                 low++;
            }

            if((high-low+1)-maxfreq <=k){
                maxlen = Math.max(maxlen,(high-low)+1);
            }
            high++;
        }
        return maxlen;
    }
}