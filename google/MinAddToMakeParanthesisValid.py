#https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

class Solution(object):
    def minAddToMakeValid(self, S):
        """
        :type S: str
        :rtype: int
        """
        fronts = 0
        total = 0
        for ch in S:
            if ch == ')':
                if fronts == 0:
                    total += 1
                else:
                    fronts -= 1
            else:
                fronts += 1
        return fronts + total