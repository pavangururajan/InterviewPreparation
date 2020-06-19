# https://leetcode.com/problems/knight-dialer/

class Solution(object):
    def knightDialer(self, N):
        """
        :type N: int
        :rtype: int
        """
        modulo = 1000000007
        movement = {
            0: (4, 6),
            1: (6, 8),
            2: (7, 9),
            3: (4, 8),
            4: (0, 3, 9),
            5: tuple(),
            6: (0, 1, 7),
            7: (2, 6),
            8: (1, 3),
            9: (2, 4)
        }
        result = [1] * 10
        for i in range(1, N):
            new_result = [0] * 10
            for j in range(10):
                new_result[j] = sum([result[k] for k in movement[j]])
            result = new_result
        final = sum(result) % modulo
        return final