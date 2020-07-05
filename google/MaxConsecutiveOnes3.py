# https://leetcode.com/problems/max-consecutive-ones-iii/


from typing import List

class Solution:

    def longestOnes(self, A: List[int], K: int) -> int:
        j=0
        for i, n in enumerate(A):
            K -= 1-n
            if K < 0:
                K += 1 - A[j]
                j += 1
        return len(A) - j

soln = Solution()
print(soln.longestOnes([1,1,1,0,0,0,1,1,1,1,0], 2))