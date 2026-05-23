class Solution:
    def isPalindrome(self, s: str) -> bool:
        string = s.lower()
        print(string)
        lookup ="abcdefghijklmnopqrstuvwxyz0123456789"
        s_ =""
        for ch in string:
            if ch in lookup:
                s_+=ch
        return s_ == s_[::-1]