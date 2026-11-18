class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxLen = Math.min(s.length(),1);
        Set<Character> seen = new HashSet<>();
        while(j<s.length()){
            char c = s.charAt(j);

            while(seen.contains(c)){
                seen.remove(s.charAt(i));
                i++;
            }

            seen.add(c);
            maxLen = Math.max(maxLen, (j-i)+1);
            j++;

        }

        return maxLen;
    }
}