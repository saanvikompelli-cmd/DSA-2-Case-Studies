# Snapdeal Product Catalog Sorting using Timsort

## Overview

This project demonstrates the working of Timsort, a hybrid stable sorting algorithm used in Python and Java.

## Problem Statement

Given a partially sorted product catalog:

[3, 7, 11, 5, 4, 6, 9, 12, 1, 2, 8, 10, 13, 14]

Apply Timsort by:

1. Detecting natural runs
2. Reversing descending runs
3. Merging runs stably
4. Producing the final sorted array

## Detected Runs

Run1 = [3,7,11]

Run2 = [4,5]

Run3 = [6,9,12]

Run4 = [1,2,8,10,13,14]

## Final Output

[1,2,3,4,5,6,7,8,9,10,11,12,13,14]

## Advantages of Timsort

- Stable Sorting
- O(n) on nearly sorted data
- O(n log n) worst case
- Efficient for real-world workloads

## Technologies

- Java
- Timsort Concepts
- Stable Merge

## Conclusion

Timsort is optimized for partially sorted datasets and is widely used in production systems.
