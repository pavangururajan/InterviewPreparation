# https://leetcode.com/problems/minimum-window-substring/

from collections import Counter
import sys

class Solution:

	def minWindow(self, s: str, t: str) -> int:
		freq = Counter(t)
		end = 0
		begin = 0
		balance = sum(freq.values())
		minimum = sys.maxsize
		result = ""
		while end < len(s):
			ch = s[end]
			if ch in freq:
				freq[ch] -= 1
				if freq[ch] >= 0:
					balance -= 1
			end += 1
			while balance <= 0:
				if minimum > end-begin:
					result = s[begin:end]
					minimum = min(minimum, end-begin)
				begin_ch = s[begin]
				if begin_ch in freq:
					freq[begin_ch] += 1
					if freq[begin_ch] > 0:
						balance += 1
				begin += 1
		return result

soln = Solution()
print(soln.minWindow("abwxzfdpyaxcyb", "abc"))
print(soln.minWindow("ADOBECODEBANC", "ABC"))