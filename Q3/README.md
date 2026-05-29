# Wikipedia Hyperlink Graph using BFS

## Overview

This project demonstrates the use of Breadth First Search (BFS) to find the minimum hop-count between Wikipedia articles.

The case study is based on the "Six Degrees of Separation" concept.

## Articles

- Cricket
- India
- Mumbai
- Sachin
- Wankhede
- Tendulkar
- Bandra
- MumbaiCity

## Hyperlink Connections

Cricket ↔ India
Cricket ↔ Sachin
India ↔ Mumbai
India ↔ Tendulkar
Mumbai ↔ Wankhede
Mumbai ↔ Bandra
Mumbai ↔ MumbaiCity
Sachin ↔ Tendulkar
Sachin ↔ Wankhede
Tendulkar ↔ Wankhede
Bandra ↔ MumbaiCity

## Algorithm Used

Breadth First Search (BFS)

## Why BFS?

BFS explores nodes level-by-level and guarantees shortest paths in an unweighted graph.

## Time Complexity

O(V + E)

Where:

- V = Number of Vertices
- E = Number of Edges

## Sample Output

Cricket -> Distance 0
India -> Distance 1
Sachin -> Distance 1
Mumbai -> Distance 2
Tendulkar -> Distance 2
Wankhede -> Distance 2
Bandra -> Distance 3
MumbaiCity -> Distance 3

## Conclusion

BFS efficiently computes minimum hyperlink distances and demonstrates the Six Degrees of Separation phenomenon.
