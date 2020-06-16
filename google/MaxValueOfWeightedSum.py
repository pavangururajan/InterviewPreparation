# https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/

class Solution:

    def max_value_of_weighted_sum(self, nums):
        total = sum(nums)
        currentVal = sum([i*j for i, j in enumerate(nums)])
        maxVal = currentVal
        for i in range(len(nums)):
            currentVal += len(nums) * nums[i] - total
            maxVal = max(maxVal, currentVal)
        return maxVal

soln = Solution()
print(soln.max_value_of_weighted_sum([10,1,2,3,4,5,6,7,8,9]))
print(soln.max_value_of_weighted_sum([7,3,2,1,5]))
print(soln.max_value_of_weighted_sum([7]))
