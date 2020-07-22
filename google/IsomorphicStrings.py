# https://leetcode.com/problems/isomorphic-strings

from typing import List
from io import StringIO

class Solution:

    def isIsomorphic(self, s: str, t: str) -> bool:
        if not s and not t:
            return True
        if not s or not t:
            return False
        if len(s) != len(t):
            return False
        charmap = {}
        rev_charmap = {}
        for m, n in zip(s, t):
            if m not in charmap and n not in rev_charmap:
                charmap[m] = n
                rev_charmap[n] = m
            else:
                if (m in charmap and n != charmap[m]) or (n in rev_charmap and m != rev_charmap[n]):
                    return False
        return True
        
    def encodeString(self, string):
        counter = 0
        charmap = {}
        new_string = StringIO()
        for ch in string:
            if ch not in charmap:
                charmap[ch] = chr(ord('a')+counter)
                counter += 1
            new_string.write(charmap[ch])
        return new_string.getvalue()

    def isNonIsomorphic(self, strlist: List[str]) -> List[str]:
        all_strings = {}
        result = []
        for string in strlist:
            new_string = self.encodeString(string)
            if new_string in all_strings:
                all_strings[new_string].append(string)
            else:
                all_strings[new_string] = [string]
        for encoded, items in all_strings.items():
            if len(items) < 2:
                result.append(items[0])
        return result

soln = Solution()
print(soln.isNonIsomorphic(["foo", "bar", "daa", "sit"]))
print(soln.isIsomorphic("bar", "foo"))