class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        total_apple = sum(apple)

        capacity.sort(reverse=True)
        print(capacity)
        print(total_apple)

        min_box =0

        for box in capacity:
            if box> total_apple:
                min_box +=1
                total_apple = 0
            else:
                total_apple -=box
                min_box +=1
            if total_apple ==0:
                break
        return min_box        