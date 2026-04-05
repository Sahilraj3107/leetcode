class Solution:
    def judgeCircle(self, moves: str) -> bool:
        horizontal, vertical =0,0
        for ch in moves:
            if ch=='L':
                horizontal -=1
            elif ch =='R':
                horizontal +=1
            elif ch =='U':
                vertical +=1
            else:
                vertical -=1
        if horizontal==0 and vertical ==0:
            return True
        return False                         