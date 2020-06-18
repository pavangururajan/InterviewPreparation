# https://leetcode.com/problems/score-of-parentheses/

class Solution(object):
    def scoreOfParentheses(self, S):
        """
        :type S: str
        :rtype: int
        """
        total = 0
        factor = 1
        i = 0
        while i < len(S):
            if S[i] == ')':
                factor = factor / 2
                i += 1
            else:
                if S[i + 1] == ')':
                    total += factor
                    i += 2
                else:
                    factor *= 2
                    i += 1
        return total
