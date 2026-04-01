class Solution:
    def survivedRobotsHealths(self, positions: List[int], healths: List[int], directions: str) -> List[int]:
        #first sort health and directons based on positions,
        combined = sorted(zip(positions, healths, list(directions), range(len(positions))),
                          key=lambda x: x[0])
        combined = [list(c) for c in combined]
        n =len(combined)
        stk =[]

        # then use stack to store health and direction
        for i in range(n):
            cur = combined[i]
            if cur[2]== 'L':
                while len(stk)>0 and stk[-1][2]=='R':
                    top = stk[-1]
                    if top[1] > cur[1]:
                        top[1]-=1
                        cur = None
                        break
                    elif top[1] == cur[1]:  
                        cur =None
                        stk.pop()
                        break
                    else:
                        cur[1]-=1
                        stk.pop()
                if cur is not None:            
                    stk.append(cur)
            else:
                stk.append(cur)        
        stk.sort(key=lambda x: x[3])
        return [robot[1] for robot in stk]