# Steel Mill Rod Cutting using Dynamic Programming

## Overview

This project solves the Rod Cutting Problem using Dynamic Programming.

A steel rod of length 10 must be cut into smaller pieces to maximize revenue.

## Price Table

Length : 0 1 2 3 4 5 6 7 8 9 10

Price  : 0 1 5 8 9 10 17 17 20 24 30

## Dynamic Programming Formula

dp[i] = max(price[k] + dp[i-k])

where 1 ≤ k ≤ i

## Time Complexity

O(n²)

## Space Complexity

O(n)

## Output

Maximum Revenue = 30

Optimal Cuts:
10

## Relation to Knapsack

Rod Cutting is equivalent to the Unbounded Knapsack Problem.

## Conclusion

Dynamic Programming guarantees the optimal revenue while avoiding redundant computations.
