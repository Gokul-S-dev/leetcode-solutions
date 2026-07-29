class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
        for(char i: s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Character,Integer>entry : mp.entrySet()){
            if(entry.getValue()==1){
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}