# https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/

from typing import List

class Solution:
	def maxSideLength(self, mat: List[List[int]], threshold: int) -> int:
		m = len(mat)
		n = len(mat[0])
		sum = [[0]*(len(mat[0])+1) for _ in range(len(mat)+1)]

		length = 1
		res = 0
		for i in range(1, len(mat)+1):
			for j in range(1, len(mat[0])+1):
				sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + mat[i-1][j-1]

				if i >= length and j >= length and (sum[i][j] - sum[i-length][j] - sum[i][j-length] + sum[i-length][j-length]) <= threshold:
					res = length
					length += 1					
		return res

soln = Solution()
mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]]
threshold = 4
print(soln.maxSideLength(mat, threshold))