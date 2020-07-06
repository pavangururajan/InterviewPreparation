# https://leetcode.com/problems/max-area-of-island/

from typing import List

class Solution:

    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        max_area = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    max_area = max(max_area, self.find_area(grid, i, j))
        return max_area

    def find_area(self, grid, i, j):
        if i >= 0 and i < len(grid) and j >= 0 and j < len(grid[0]) and grid[i][j] == 1:
            grid[i][j] = 0
            return 1 + self.find_area(grid, i+1, j) + self.find_area(grid, i, j+1) + self.find_area(grid, i-1, j) + self.find_area(grid, i, j-1)
        return 0

matrix = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]

soln = Solution()
print(soln.maxAreaOfIsland(matrix))

matrix = [[0,1]]
print(soln.maxAreaOfIsland(matrix))