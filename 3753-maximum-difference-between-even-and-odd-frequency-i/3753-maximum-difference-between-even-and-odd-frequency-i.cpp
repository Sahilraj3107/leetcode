class Solution {
public:
    int maxDifference(string s) {
        map<char, int> mpp;

        for(int i=0;i<s.size();i++){
            mpp[s[i]]++;
        }
        int even =INT_MAX, odd =0;
        for(auto it : mpp){
          if(it.second%2==0 && it.second<even)even =it.second;
          else if(it.second%2!=0 && it.second>odd) odd = it.second;
        }
        return odd-even;
    }
};