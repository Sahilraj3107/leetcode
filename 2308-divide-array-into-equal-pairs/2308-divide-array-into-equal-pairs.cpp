class Solution {
public:
    bool divideArray(vector<int>& nums) {
        map<int,int> freq;

        for(int num : nums){
            freq[num]++;
        }
        for(auto it : freq){
            if(it.second%2!=0)return false;
        }
        return true;
    }
};