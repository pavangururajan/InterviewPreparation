
class Solution:

    def shifted_arr_search(self, shiftArr, num):
        start = 0
        end = len(shiftArr)-1
        while start <= end:
          mid = start + (end-start)//2
          if shiftArr[mid] == num:
            return mid
          elif shiftArr[mid] < num:
            if num <= shiftArr[end] or shiftArr[start] < num:
              start = mid+1
            else:
              end = mid-1
          else: # shiftArr[mid] > num
            if num >= shiftArr[start] or shiftArr[end] < num:
              end = mid-1
            else:
              start = mid+1
        return -1

soln = Solution()
print(soln.shifted_arr_search([5,1,2,3,4], 1))