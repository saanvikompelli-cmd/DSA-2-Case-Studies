# Discord Server Roster using AVL Tree with Rank Augmentation

## Overview

This project implements an AVL Tree with Rank Augmentation to efficiently answer rank-based queries such as:

"Find the k-th most senior member in a Discord server."

Each member is identified by a unique join timestamp.

## Problem Statement

A Discord server contains thousands of members.

Moderators frequently need to determine the k-th most senior member for:

- Badge assignment
- Member auditing
- Priority access
- Historical analysis

A normal AVL Tree supports insertion and deletion in O(log n) time but rank queries can take O(n).

To solve this issue, subtree sizes are stored at every node.

## Features

- AVL Tree balancing
- LL, RR, LR, RL Rotations
- Subtree Size Augmentation
- O(log n) Rank Queries
- O(log n) Insert/Delete Operations

## Technologies

- Java
- AVL Trees
- Rank Augmentation

## Time Complexity

| Operation | Complexity |
|------------|------------|
| Insert | O(log n) |
| Delete | O(log n) |
| Find k-th Element | O(log n) |
| Traversal | O(n) |

## Sample Output

Inorder Traversal:
1001 1002 1003 1004 1005 1006 1007 1008 1010 1012

3-th most senior member is: 1003

## Conclusion

Rank-Augmented AVL Trees significantly improve rank query performance while maintaining AVL balancing properties.
