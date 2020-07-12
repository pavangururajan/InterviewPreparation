# https://leetcode.com/problems/stone-game-iii/

from typing import List
from functools import lru_cache
import sys

class Solution:

    def stoneGameIII(self, stoneValue: List[int]) -> str:
        sumArray = [0]*(len(stoneValue)+1)
        for i in range(len(stoneValue)-1, -1, -1):
            sumArray[i] = sumArray[i+1] + stoneValue[i]
        dp = [0]*(len(stoneValue)+1)
        for i in range(len(stoneValue)-1, -1, -1):
            dp[i] = stoneValue[i] + sumArray[i+1] - dp[i+1]
            for k in range(i+1, min(len(stoneValue), i+3)):
                dp[i] = max(dp[i], sumArray[i]-dp[k+1])
        if dp[0]*2 == sumArray[0]:
            return "Tie"
        elif dp[0]*2 < sumArray[0]:
            return "BoB"
        else:
            return "Alice"


soln = Solution()
print(soln.stoneGameIII([1,2,3,7]))