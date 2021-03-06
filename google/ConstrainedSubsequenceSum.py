# https://leetcode.com/problems/constrained-subsequence-sum/

import collections

class Solution:
    def constrainedSubsetSum(self, A, k):
        deque = collections.deque()
        for i in range(len(A)):
            A[i] += deque[0] if deque else 0
            while len(deque) and A[i] > deque[-1]:
                deque.pop()
            if A[i] > 0:
                deque.append(A[i])
            if i >= k and deque and deque[0] == A[i - k]:
                deque.popleft()
        return max(A)

soln = Solution()
print(soln.constrainedSubsetSum([10,-2,-10,-5,20], 2))
print(soln.constrainedSubsetSum([-7609,249,-1699,2385,9125,-9037,1107,-8228,856,-9526], 9))