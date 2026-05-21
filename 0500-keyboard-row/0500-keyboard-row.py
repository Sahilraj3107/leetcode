class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        n = len(words)
        rows = ["qwertyuiop","asdfghjkl", "zxcvbnm"]
        res = []

        for i in range(n):
            curr = words[i].lower()
            idx =-1
            if curr[0] in rows[0]:
                idx = 0
            elif curr[0] in rows[1]:
                idx =1
            else:
                idx =2
            for ch in curr:
                if ch not in rows[idx]:
                    idx =-1
                    break
            if idx!=-1:
                res.append(words[i])
        return res                       