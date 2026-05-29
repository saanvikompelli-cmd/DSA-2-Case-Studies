# Google Maps Live Re-routing using Dijkstra Algorithm

## Overview

This project demonstrates how navigation systems such as Google Maps use shortest path algorithms to determine optimal routes and recompute paths when road closures occur.

## Problem Statement

Find the shortest route from:

KOR (Koramangala)

to

EC (Electronic City)

using Dijkstra's Algorithm.

A road closure occurs between:

MGR ↔ HSR

and the route must be recomputed.

## Graph Details

Nodes:

- IND
- KOR
- MGR
- HSR
- BTM
- JPN
- SRJ
- EC

Edges represent travel time in minutes.

## Algorithm Used

Dijkstra's Shortest Path Algorithm

Data Structure:

- Adjacency List
- Min Priority Queue

## Time Complexity

O((V + E) log V)

## Result

Shortest Path:

KOR → HSR → BTM → EC

Distance:

21 Minutes

Road closure MGR ↔ HSR does not affect the optimal route.

## Applications

- Google Maps
- GPS Navigation
- Ride Sharing Platforms
- Logistics Optimization
- Smart City Transportation Systems

## Conclusion

Dijkstra's Algorithm efficiently computes shortest paths and supports route recomputation in dynamic road networks.
