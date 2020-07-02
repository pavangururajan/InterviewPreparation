# https://www.geeksforgeeks.org/find-m-th-smallest-value-in-k-sorted-arrays/

from typing import List
import heapq

class Solution:

    def find_n_largest(self, mat: List[List[int]], k: int):
        maxheap = []
        for i in range(len(mat)):
            heapq.heappush(maxheap, (-mat[i][-1], i, len(mat[i])-1))

        results = []
        while maxheap and len(results) < k:
            max_element, row, col = heapq.heappop(maxheap) 
            results.append(-max_element)
            if col > 0:
                heapq.heappush(maxheap, (-mat[row][col-1], row, col-1))
        return results 

mat = [[1,3,7,10,13],[24,26,31,32,70],[3,7,11,12,14],[1,5,20,40,100]]
soln = Solution()
print(soln.find_n_largest(mat, 8))
print(soln.find_n_largest(mat, 12))