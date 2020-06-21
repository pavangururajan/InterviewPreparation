# https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/

import sys

class Solution:

    def partition(self, nums):
        total = sum(nums)

        dp = [[False]*(total+1) for _ in range(len(nums)+1)]
        for i in range(len(nums)+1):
            dp[i][0] = True

        for i in range(1, len(nums)+1):
            for j in range(total+1):
                dp[i][j] = dp[i-1][j]
                if nums[i-1] <= j:
                    dp[i][j] = dp[i][j] or dp[i-1][j-nums[i-1]]

        j = total//2
        diff = sys.maxsize
        while j >= 0:
            if dp[len(nums)][j]:
               diff = total - 2*j
               break
            j -= 1
        return diff

soln = Solution()
#print(soln.partition([1,6,11,5]))
print(soln.partition([7,3,2,5,6,10, -111, -3]))
#print(soln.partition([7]))
#print(soln.partition([]))
