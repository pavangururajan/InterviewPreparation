# https://www.geeksforgeeks.org/count-number-increasing-subsequences-size-k

class Solution:

    def countIncreasingSubsequencesOfSizeK(self, nums, k):
        dp = [[0 for i in range(k)] for j in range(len(nums))]
        for i in range(len(nums)):
            dp[i][0] = 1
        for i in range(len(nums)-1, -1, -1):
            for j in range(i+1, len(nums)):
                if nums[i] < nums[j]:
                    for m in range(1, k):
                        dp[i][m] += dp[j][m-1]
        return sum([dp[i][k-1] for i in range(len(nums))])


soln = Solution()
print(soln.countIncreasingSubsequencesOfSizeK([1,2,3,4,5], 3))
print(soln.countIncreasingSubsequencesOfSizeK([1,5,3,7,10], 3))
