# https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
from collections import deque
from io import StringIO
class Solution(object):
    def reverseParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = deque()
        result = StringIO()
        for ch in s:
            if ch == '(':
                stack.append(len(result.getvalue()))
            elif ch == ')':
                old_string = result.getvalue()
                closed_index = stack.pop()
                result = StringIO()
                result.write(old_string[:closed_index])
                result.write(''.join(reversed(old_string[closed_index:])))
            else:
                result.write(ch)
        return result.getvalue()