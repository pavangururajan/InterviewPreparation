# https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/

from collections import namedtuple
from typing import List, NamedTuple
import sys

class Solution:

    class Edge(NamedTuple):
        index: int
        fromm: int
        to: int
        weight: int


    def findCriticalAndPseudoCriticalEdges(self, n, edges):

        index_edges = [self.Edge(i, edge[0], edge[1], edge[2]) for i, edge in enumerate(edges)]

        mst_weight, mst_edges = self.return_mst(index_edges, n, None, None)
        critical = set()
        pseudos = set()

        for e in index_edges:
            weight, mst_edges = self.return_mst(index_edges, n, None, e)
            if weight > mst_weight:
                critical.add(e.index)
            else:
                weight, mst_edges = self.return_mst(index_edges, n, e, None)
                if weight == mst_weight:
                    pseudos.add(e.index)

        return [list(critical), list(pseudos)]

    def return_mst(self, edges: List[Edge], n: int, include:Edge=None, avoid:Edge=None):
        weight = 0
        mst_edges = []
        uf = UnionFind(n)
        if include:
            uf.union(include.fromm, include.to)
            weight += include.weight
            mst_edges.append(include.index)

        for edge in sorted(edges, key=lambda x: x[-1]):
            if avoid and avoid.index == edge.index:
                continue
            if include and include.index == edge.index:
                continue
            if not uf.union(edge.fromm, edge.to):
                continue
            weight += edge.weight
            mst_edges.append(edge.index)
        if uf._count == 1:
            return (weight, mst_edges)
        else:
            return (sys.maxint, mst_edges)

class UnionFind:

    def __init__(self, n):
        self.n = n
        self._parents = [i for i in range(n)]
        self._count = n

    def reset(self):
        self._parents = [i for i in range(self.n)]
        self._count = self.n

    def find(self, i):
        parent = self._parents[i]
        if (parent == i):
            return i
        else:
            root = self.find(parent)
            self._parents[i] = parent
            return root

    def union(self, i, j):
        p1 = self.find(i)
        p2 = self.find(j)
        if p1 != p2:
            self._count -= 1
            self._parents[p1] = p2
            return True
        else:
            return False

soln = Solution()
print(soln.findCriticalAndPseudoCriticalEdges(5, [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]))
print(soln.findCriticalAndPseudoCriticalEdges(4, [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]))
