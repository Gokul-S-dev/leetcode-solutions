
class Solution {
public:
    bool isPowerOfThree(int n) {
        if (n <=0) return false;
        long long maxpow =pow(3,19);
        return maxpow%n==0;
        
    }
};