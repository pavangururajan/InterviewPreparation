# https://leetcode.com/problems/sliding-window-median/

import heapq
import sys
from collections import defaultdict

class Solution:

    def medianSlidingWindow(self, nums, k):
        max_heap = []
        min_heap = []
        outgoing = defaultdict(int)
        median = []

        for n in nums[:k]:
            heapq.heappush(max_heap, -n)
        for _ in range(k//2):
            heapq.heappush(min_heap, -heapq.heappop(max_heap))

        for i, n in enumerate(nums[k:]):
            median.append(-max_heap[0] if k%2 == 1 else (-max_heap[0]+min_heap[0])/2)
            balance = 0
            balance += -1 if nums[i] <= -max_heap[0] else 1
            outgoing[nums[i]] += 1
            if n <= -max_heap[0]:
                balance += 1
                heapq.heappush(max_heap, -n)
            else:
                balance -= 1
                heapq.heappush(min_heap, n)
            if balance < 0:
                balance += 1
                heapq.heappush(max_heap, -heapq.heappop(min_heap))
            if balance > 0:
                balance -= 1
                heapq.heappush(min_heap, -heapq.heappop(max_heap))

            while outgoing.get(-max_heap[0], 0) > 0:
                outgoing[-max_heap[0]] -= 1
                heapq.heappop(max_heap)

            while min_heap and outgoing.get(min_heap[0], 0) > 0:
                outgoing[min_heap[0]] -= 1
                heapq.heappop(min_heap)

        median.append(-max_heap[0] if k%2 == 1 else (-max_heap[0]+min_heap[0])/2)

        return median

soln = Solution()
print(soln.medianSlidingWindow([1,2,3,4,2,3,1,4,2], 3))
