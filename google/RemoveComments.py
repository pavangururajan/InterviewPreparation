# https://leetcode.com/problems/remove-comments/

from typing import List
from io import StringIO

class Solution:

    def remove_comments(self, source: List[str]) -> List[str]:
        result = []
        block_comment = False
        offset = 0
        for line in source:
            if block_comment:
                if line.find('*/') != -1:
                    offset = line.find('*/')+2
            lcomment, bcomment = line.find('//', offset), line.find('/*', offset)
            comment_index = min(lcomment, bcomment)
            remaining = StringIO()
            if comment_index != -1:
                if comment_index != 0:
                    remaining.write(line[offset:comment_index])
                if bcomment == comment_index:
                    if line.find('*/') > comment_index:
                        result.append('%s%s'%(result.pop(), line[line.find('*/'):]))
                    else:
                        block_comment = True
        return result
