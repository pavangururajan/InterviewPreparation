# https://leetcode.com/problems/redundant-connection/
# https://leetcode.com/problems/redundant-connection-ii/

from typing import List

class Solution:

    parent = {}
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        result = None
        for edge in edges:
            if not self.union(edge[0], edge[1]):
                result = edge
                break
        return result

    def find(self, x):
        if x not in self.parent:
            self.parent[x] = x
            return x
        if self.parent[x] == x:
            return x
        self.parent[x] = self.find(self.parent[x])
        return self.parent[x]

    def union(self, x, y):
        m, n = self.find(x), self.find(y)
        if m == n:
            return False
        if m > n:
            m, n = n, m
        self.parent[n] = m
        return True

soln = Solution()
#print(soln.findRedundantDirectedConnection([[1,2], [2,3], [3,4], [4,1], [1,5]]))

#print(soln.findRedundantConnection([[3,4], [2,1], [4,5], [2,4], [3,2]]))

print(soln.findRedundantConnection([[1,2],[2,3],[3,4],[1,4],[1,5]]))
