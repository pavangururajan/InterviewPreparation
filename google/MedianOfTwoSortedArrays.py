# https://leetcode.com/problems/median-of-two-sorted-arrays/solution/

import statistics
import sys

class Solution:

    def find_median_of_two_sorted_arrays(self, x, y):
        if not x and not y:
            return 0

        if not x or not y:
            a = x or y
            mid = (len(a)+1)//2 - 1
            return a[mid] if len(a) % 2 == 1 else statistics.mean([a[mid], a[mid+1]])

        if len(x) > len(y):
            y, x = x, y
        m, n = len(x), len(y)
        partition_x = len(x)//2
        partition_y = (m+n+1)//2 - partition_x

        while 0 <= partition_x <= m:
            left_x = x[partition_x-1] if partition_x > 0 else -(sys.maxsize-2)
            right_x = x[partition_x] if partition_x < m else sys.maxsize
            left_y = y[partition_y-1] if partition_y > 0 else -(sys.maxsize-2)
            right_y = y[partition_y] if partition_y < n else sys.maxsize

            if left_x < right_y and left_y < right_x:
                if (m+n) % 2 == 1:
                    return max(left_y, left_x)
                else:
                    return statistics.mean([max(left_x, left_y), min(right_x, right_y)])

            if left_x > right_y:
                partition_x -= 1
            else: # left_y > right_x
                partition_x += 1

            partition_y = (m+n+1)//2 - partition_x

        return -1


soln = Solution()
print(soln.find_median_of_two_sorted_arrays([], [6]))
print(soln.find_median_of_two_sorted_arrays([1], []))
print(soln.find_median_of_two_sorted_arrays([1,2, 4, 11], [3, 7, 12, 17]))
print(soln.find_median_of_two_sorted_arrays([], []))
