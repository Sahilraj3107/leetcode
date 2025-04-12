class Solution {
public:
    bool isEqual(string s){
        int i =0, j =s.size()-1;
        long leftSum=0, rightSum=0;

        while(i<j){
            leftSum += s[i]-'0';
            rightSum += s[j]-'0';
            i++;
            j--;
        }
        if(leftSum==rightSum)return true;
        
        return false;
    }
    int countSymmetricIntegers(int low, int high) {
       int cnt =0;
       while(low<=high){
        string s =to_string(low);
        if(s.size()%2==0){
            if(isEqual(s))cnt++;
        }
        low++;
       } 
     return cnt;
    }
};