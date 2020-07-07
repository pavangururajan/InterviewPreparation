# https://leetcode.com/problems/decode-string/

from collections import deque
from io import StringIO

class Solution:

    def decodeString(self, s: str) -> str:
        stack = deque()
        current_string = StringIO()
        current_num = 0
        for ch in s:
            if ch == '[':
                stack.append(current_string.getvalue())
                stack.append(current_num)
                current_string = StringIO()
                current_num = 0
            elif ch == ']':
                num = stack.pop()
                previous = stack.pop()
                new_string = StringIO()
                new_string.write(previous)
                new_string.write(current_string.getvalue()*num)
                current_string = new_string
            elif ch.isdigit():
                current_num = 10*current_num + int(ch)
            else:
                current_string.write(ch)
        return current_string.getvalue()

soln = Solution()
print(soln.decodeString("100[leetcode]"))