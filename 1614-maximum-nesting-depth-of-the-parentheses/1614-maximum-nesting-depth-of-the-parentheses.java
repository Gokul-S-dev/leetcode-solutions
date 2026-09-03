class Solution {
    public int maxDepth(String s) {

        int res = Integer.MIN_VALUE;
        int curr = 0;

        for(char c:s.toCharArray()){
            if(c=='('){
                curr++;
            }else if(c==')'){
                curr--;
            }
            res = Math.max(curr,res);
        }
        return res;
        
    }
}