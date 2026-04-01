class Solution {
public:
    string categorizeBox(int length, int width, int height, int mass) {
         // Check Bulky
        bool bulky = false;
        
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            bulky = true;
        }
        
        long long volume = 1LL * length * width * height;
        if (volume >= 1000000000) {
            bulky = true;
        }
        
        // Check Heavy
        bool heavy = (mass >= 100);
        
        // Final Category
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        
        return "Neither";
    }
};