# https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
# https://www.geeksforgeeks.org/longest-subarray-in-which-absolute-difference-between-any-two-element-is-not-greater-than-x/

from typing import List
import heapq
from collections import deque

class Solution:

    def longestSubarray(self, nums: List[int], limit: int) -> int:
        maximum = 0
        max_heap = []
        min_heap = []
        the_index = 0
        for j, n in enumerate(nums):
            heapq.heappush(max_heap, (-n, j))
            heapq.heappush(min_heap, (n, j))
            if abs(-max_heap[0][0]-min_heap[0][0]) > limit:
                min_index = min_heap[0][1]
                max_index = max_heap[0][1]
                the_index = min(min_index, max_index)+1
                while max_heap and max_heap[0][1] < the_index:
                    heapq.heappop(max_heap)
                while min_heap and min_heap[0][1] < the_index:
                    heapq.heappop(min_heap)
            maximum = max(maximum, j-the_index+1)
        return maximum

    def longestSubarray2(self, nums, limit):
        maxq = deque()
        minq = deque()
        i = 0
        for n in nums:
            while maxq and n > maxq[-1]:
                maxq.pop()
            while minq and n < minq[-1]:
                minq.pop()
            maxq.append(n)
            minq.append(n)
            if maxq[0] - minq[0] > limit:
                if maxq[0] == nums[i]:
                    maxq.popleft()
                if minq[0] == nums[i]:
                    minq.popleft()
                i += 1
        return len(nums) - i


soln = Solution()
print(soln.longestSubarray([8,2,4,7], 4))
print(soln.longestSubarray2([8,2,4,7], 4))