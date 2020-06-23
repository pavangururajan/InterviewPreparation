# https://leetcode.com/problems/maximize-distance-to-closest-person/


class Solution(object):
    def maxDistToClosest(self, seats):
        """
        :type seats: List[int]
        :rtype: int
        """
        max_distance = -1
        distance_from_left = [len(seats)] * len(seats)
        current = 0
        for i in seats:
            if i == 0:
                distance_from_left[i] -= 1
            else:
                current = 0
            distance_from_left.append(current)
        current = len(seats)
        for i, j in zip(seats[::-1], distance_from_left[::-1]):
            if i == 0:
                current += 1
            else:
                current = 0
            max_distance = max(max_distance, min(current, j))
        return max_distance

soln = Solution()
print(soln.maxDistToClosest([1,0,0,0,1,0,1]))