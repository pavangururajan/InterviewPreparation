# https://leetcode.com/problems/missing-element-in-sorted-array/

class Solution:

	def find_kth_missing(self, nums, k):
		if not nums or len(nums) <= 1:
			return -1
		diff = (nums[-1]-nums[0])+1-len(nums)
		if k > diff:
			return nums[-1]+(k-diff)
		return self.find_kth_missing_helper(nums, 0, len(nums)-1, k)

	def find_kth_missing_helper(self, nums, start, end, k):
		current_diff = 0
		while start <= end:
			mid = end - (end - start)//2
			current_diff = nums[mid]-nums[0]-mid
			if start == end:
				return nums[start]+ k - current_diff
			if current_diff >= k:
				end = mid-1
			else:
				start = mid
		return -1

soln = Solution()
print(soln.find_kth_missing([4,7,9,10], 1))

