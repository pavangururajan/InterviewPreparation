# https://leetcode.com/problems/avoid-flood-in-the-city/

import collections
import heapq

class Solution:
    def avoidFlood(self, rains):
        closest = []
        locs = collections.defaultdict(collections.deque)
        for i, lake in enumerate(rains):
            locs[lake].append(i)
        ret = []
        for i, lake in enumerate(rains):
            if closest and closest[0] == i:
                return []
            if not lake:
                if not closest:
                    ret.append(1)
                    continue
                nxt = heapq.heappop(closest)
                ret.append(rains[nxt])
            else:
                l = locs[lake]
                l.popleft()
                if l:
                    nxt = l[0]
                    heapq.heappush(closest, nxt)
                ret.append(-1)
        return ret

soln = Solution()
print(soln.avoidFlood([0,0,6,7,0,6,0,7]))