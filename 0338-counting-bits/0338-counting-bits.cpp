class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans;
        for(int j=0;j<=n;j++){
            int count=0;
            int i=j;
            while(i!=0){
                if((i & 1) == 1){
                    count++;
                }
                i >>=1;
            }
            ans.push_back(count);
        }
        return ans;
        
    }
};