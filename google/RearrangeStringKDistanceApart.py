# https://leetcode.com/problems/rearrange-string-k-distance-apart/

from collections import Counter, deque
import heapq

class Solution:

    def rearrangeString(self, s: str, k: int) -> str:
        freq = Counter(s)
        elements = [(-j, i) for i, j in freq.most_common(len(s))]
        heapq.heapify(elements)
        waitqueue = deque()
        result = []

        while len(elements) > 0:
            next_frequent_ch = heapq.heappop(elements)
            inv_count, ch = next_frequent_ch
            result.append(ch)
            waitqueue.append((inv_count+1, ch))

            if len(waitqueue) < k:
                continue

            next_char = waitqueue.popleft()
            if next_char[0] < 0:
                heapq.heappush(elements, next_char)

        if len(result) != len(s):
            return 'NOSTRING'
        return ''.join(result)

soln = Solution()
print(soln.rearrangeString("aaabbcc", 3))
print(soln.rearrangeString("aaabbcc", 4))
print(soln.rearrangeString("aaabbcc", 2))
