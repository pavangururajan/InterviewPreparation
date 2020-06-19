# https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution(object):
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        if cost is None or len(cost) == 0:
            return 0
        if len(cost) <= 2:
            return min(cost)
        prev, two_prev = 0, 0
        current = 0
        for i in range(2, len(cost)+1):
            current = min(prev+cost[i-1], two_prev+cost[i-2])
            two_prev = prev
            prev = current
        return current