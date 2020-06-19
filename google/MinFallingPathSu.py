# https://leetcode.com/problems/minimum-falling-path-sum/

class Solution(object):
    def minFallingPathSum(self, A):
        """
        :type A: List[List[int]]
        :rtype: int
        """
        if len(A) == 0:
            return 0
        prev_row = [0]*len(A[0])
        for i in range(1, len(A)+1):
            current = [0]*len(A[0])
            for j in range(len(A[0])):
                current[j] = A[i-1][j] + min(prev_row[max(0, j-1):min(len(A[0]), j+1)+1])
            prev_row = current
        return min(current)