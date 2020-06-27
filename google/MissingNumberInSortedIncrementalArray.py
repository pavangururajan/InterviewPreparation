# https://www.geeksforgeeks.org/find-the-missing-number-in-a-sorted-array/

class Solution:

    def find_missing_number(self, nums):
        if len(nums) <= 1:
            return -1
        return self.find_missing_number_helper(nums, 0, len(nums)-1)

    def find_missing_number_helper(self, nums, start, end):
        while start <= end:
            mid = end - (end - start)//2
            if mid != nums[mid]-nums[0]:
                if mid > 0 and nums[mid-1] != nums[mid]-1:
                    return nums[mid] - 1
                end = mid-1
            else: # mid is correct
                start = mid+1

        return -1

soln = Solution()
print(soln.find_missing_number([5,6,7,8,10,11,12]))
