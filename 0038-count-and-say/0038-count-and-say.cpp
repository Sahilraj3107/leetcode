class Solution {
public:
    string countAndSay(int n) {
        string s ="1";
        int cnt =1;
        for(int i=1;i<n;i++){
          string temp ="";
          cnt=1;
          char ch =s[0];
          for(int i=1;i<s.size();i++){
            if(s[i]==s[i-1])cnt++;
            else {
                temp += to_string(cnt) + ch;
                ch =s[i];
                cnt=1;
            }
          }
          temp += to_string(cnt) + ch;
          s =temp;
        }
        return s;
    }
};