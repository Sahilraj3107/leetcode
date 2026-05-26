class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lowercase, uppercase = "abcdefghigklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        cnt =0

        for i in range(26):
            if (lowercase[i] in word) and (uppercase[i] in word):
                cnt+=1
        return cnt        

