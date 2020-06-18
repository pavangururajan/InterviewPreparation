# https://leetcode.com/problems/meeting-rooms-ii/solution/
import operator

class Solution(object):
    def minMeetingRooms(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        unrolled = []
        running = 0
        maximum = 0
        for start, end in intervals:
            unrolled.append((start, -1))
            unrolled.append((end, 1))

        for t, dec in sorted(unrolled):
            running -= dec
            maximum = max(maximum, running)

        return maximum


soln = Solution()
print(soln.minMeetingRooms([[13, 15], [1, 13]]))