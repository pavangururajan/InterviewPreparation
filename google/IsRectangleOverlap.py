# https://leetcode.com/problems/rectangle-overlap/

from typing import List

class Solution:

    def isRectangleOverlap(self, rec1: List[int], rec2: List[int]) -> bool:
        x1, y1, x2, y2 = rec1
        m1, n1, m2, n2 = rec2

        totheright = m1 > x2
        totheleft = m2 < x1
        tothetop = n1 > y2
        tothebottom = n2 < y1

        if totheright or totheleft or tothetop or tothebottom:
            return False
        return True


soln = Solution()

print(soln.isRectangleOverlap([0,0,2,2], [1,1,3,3]))