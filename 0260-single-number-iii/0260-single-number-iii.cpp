class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {

       long long temp = 0;
for(auto num: nums) temp ^= num;

long long rightmost = temp & -temp;


        int b1=0, b2=0;

        for(auto num: nums){
            if((rightmost & num) ==0)b1^=num;
            else b2^=num;
        }
        vector<int> ans ={b1,b2};
        
        return ans;
    }
};