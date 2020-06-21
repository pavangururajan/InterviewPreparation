# https://leetcode.com/contest/weekly-contest-194/problems/making-file-names-unique/

class Solution(object):
    def getFolderNames(self, names):
        """
        :type names: List[str]
        :rtype: List[str]
        """
        count = {}
        result = []
        for n in names:
            if n in count:
                current = count[n]
                while True:
                    new_name = "%s(%s)" % (n, current)
                    if new_name not in count:
                        count[new_name] = 1
                        count[n] = current+1
                        result.append(new_name)
                        break
                    current += 1
            else:
                result.append(n)
                count[n] = 1
        return result

class Trie(object):

    def __init__(self):
        self._root = TrieNode("", False)

    def addString(self, string):
        current = self._root
        for ch in string:
            current = current.add_child(ch)
        current.mark_sentinel()

    def traverse(self, string):
        current = self._root
        for ch in string:
            current = current.get_child(ch)
            if not current:
                return False
        return True


class TrieNode(object):

    def __init__(self, value, sentinel=False):
        self._children = {}
        self._value = value
        self._sentinel = sentinel

    def add_child(self, char, sentinel=False):
        if char not in self._children:
            child = TrieNode(char, sentinel)
            self._children[char] = child
        else:
            self._children[char].sentinel = self._children[char].sentinel or sentinel
        return self._children[char]

    def get_child(self, ch):
        if ch not in self._children:
            return None
        return self._children[ch]

    def mark_sentinel(self):
        self._sentinel = True

soln = Solution()
print(soln.getFolderNames(["gss", "gss", "gss(3)", "gss", "gss", "gss(3)"]))
