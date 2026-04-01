class Solution {
public:
    bool isPowerOfTwo(int n) {
       if(n<=0) return false;
        
        double logVal=log2(n);
        return floor(logVal)==ceil(logVal);
    }
};