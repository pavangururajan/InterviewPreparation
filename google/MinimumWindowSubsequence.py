# https://leetcode.com/problems/minimum-window-subsequence/

import sys

class Solution:

	def minWindow(self, s: str, t: str) -> str:
		dp = [[0]*(len(s)+1) for _ in range(len(t)+1)]
		for i in range(1, len(t)+1):
			dp[i][0] = -1
		min_distance = sys.maxsize
		result_index = -1
		for i in range(1, len(t)+1):
			m = i-1
			for j in range(1, len(s)+1):
				n = j-1
				if s[n] == t[m] and dp[i-1][j] != -1:
					dp[i][j] = dp[i-1][j]
				else:
					if dp[i][j-1] == -1:
						dp[i][j] = dp[i][j-1]
					else:
						dp[i][j] = dp[i][j-1]+1
				if i == len(t) and dp[i][j] != -1:
					if min_distance > dp[i][j]:
						min_distance = min(min_distance, dp[i][j])
						result_index = j
		if result_index == -1:
			return ''
		return s[result_index-dp[-1][j]-1:result_index]

soln = Solution()
print(soln.minWindow("abcdebdde", "bde"))
print(soln.minWindow("axbdfwxcbawbxc", "abc"))

