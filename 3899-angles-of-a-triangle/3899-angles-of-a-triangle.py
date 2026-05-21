class Solution:
    def internalAngles(self, sides: list[int]) -> list[float]:
        a,b,c = sides[0], sides[1], sides[2]
        
        if (a+b)<=c or (a+c)<=b or (b+c)<=a:
            return []

        res =[0.0,0.0,0.0]
        res[0] = math.acos((b**2+ c**2 -a**2)/(2*b*c))
        res[1] = math.acos((a**2+ c**2 -b**2)/(2*a*c))
        res[2] = math.acos((b**2+ a**2 -c**2)/(2*b*a))

        angles = [math.degrees(res[0]), math.degrees(res[1]), math.degrees(res[2])]
        angles.sort()
        return angles


