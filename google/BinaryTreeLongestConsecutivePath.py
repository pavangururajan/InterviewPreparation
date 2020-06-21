# https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/

import collections

class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:

    def longest_consecutive(self, root):
        current, maximum = self.longest_consecutive_helper(root)
        return maximum

    def longest_consecutive_helper(self, node):
        if not node:
            return (0, 0)

        left_current, left_max = self.longest_consecutive_helper(node.left)
        right_current, right_max = self.longest_consecutive_helper(node.right)

        left_current += 1
        right_current += 1

        if node.left and node.left.val != node.val + 1:
            left_current = 1
        if node.right and node.right.val != node.val + 1:
            right_current = 1

        current = max(left_current, right_current)
        maximum = max(current, left_max, right_max)
        return (current, maximum)

def buildTree(items):
    queue = collections.deque(items)
    if len(queue) == 0:
        return None
    root = TreeNode(queue.popleft())
    create_node(queue, root)
    return root

def create_node(queue, node):
    left = queue.popleft() if len(queue) > 0 else None
    right = queue.popleft() if len(queue) > 0 else None
    node.left = TreeNode(left) if left else None
    node.right = TreeNode(right) if right else None
    if node.left:
        create_node(queue, node.left)
    if node.right:
        create_node(queue, node.right)
    return node



root = buildTree([1, None, 3, 2, 4, None, None, None, 5])

soln = Solution()
print(soln.longest_consecutive(root))