class Solution {
    private int solve(String s,int index, int sign, int result){
        // base
        if(index >= s.length() || !Character.isDigit(s.charAt(index))){
            return result*sign;
        }
        

        int digit = s.charAt(index)-'0';
        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result*10+digit;
        return solve(s,index+1,sign,result);
    }
    public int myAtoi(String s) {
        s=s.trim();

        if(s.length()==0){
            return 0;
        }

        int sign = 1;
        int start = 0;

        if(s.charAt(0)=='-'){
            start=1;
            sign =-1;
        }else if(s.charAt(0)=='+'){
            start=1;
        }

        return solve(s,start,sign,0);
    }
}