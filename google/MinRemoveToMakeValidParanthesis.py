#https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

from collections import deque
class Solution(object):
    def minRemoveToMakeValid(self, s):
        """
        :type s: str
        :rtype: str
        """
        opens = deque()
        closes = set()
        balance = 0
        for i, ch in enumerate(s):
            if ch == ')':
                if len(opens) == 0:
                    closes.add(i)
                else:
                    opens.pop()
            elif ch == '(':
                opens.append(i)
        for i in opens:
            closes.add(i)
        return ''.join([ch for i, ch in enumerate(s) if i not in closes])