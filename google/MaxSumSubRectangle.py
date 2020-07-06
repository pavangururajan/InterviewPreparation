# https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/

from typing import List
import sys

class Solution:

    def maxSumSubMatrix(self, matrix: List[List[int]], k: int) -> int:
        maxSum = -sys.maxsize
        for left in range(len(matrix[0])):
            sum = [0]*len(matrix)
            for right in range(left, len(matrix[0])):
                for i in range(len(matrix)):
                    sum[i] += matrix[i][right]
                sum_set = set()
                sum_set.add(0)
                current_sum = 0
                current_max = -sys.maxsize
                for s in sum:
                    current_sum += s
                    optimal_sum = self.set_ceil(sum_set, current_sum-k)
                    if optimal_sum is not None:
                        current_max = max(current_max, current_sum-optimal_sum)
                    sum_set.add(current_sum)
                maxSum = max(maxSum, current_max)
        return maxSum

    def set_ceil(self, numset, key):
        if key in numset:
            return key
        if not numset or key > max(numset):
            return None
        return min([i for i in numset if i >= key])


soln = Solution()
matrix = [[1,0,1],[0,-2,3]]
print(soln.maxSumSubMatrix(matrix, 2))