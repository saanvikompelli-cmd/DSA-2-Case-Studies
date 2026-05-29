# Hyderabad Metro Shortest Route using Dijkstra Algorithm

## Overview

This project demonstrates shortest-route computation in a metro network using Dijkstra's Algorithm.

A transfer penalty of 5 minutes is added whenever passengers switch metro lines.

## Metro Stations

- LB Nagar (LBN)
- Ameerpet (AMP)
- Begumpet (BGP)
- Kukatpally (KKP)
- Hitec City (HTC)
- Mehdipatnam (MHM)
- Secunderabad (SCB)

## Metro Lines

### Red Line

LBN → AMP → MHM → SCB

### Blue Line

AMP → BGP → KKP → HTC

### Green Line

AMP → KKP

## Transfer Penalty

5 Minutes

## Results

Without Transfer Penalty:

LBN → AMP → KKP → HTC

35 Minutes

With Transfer Penalty:

LBN → AMP → BGP → KKP → HTC

41 Minutes

## Complexity

O((V + E) log V)

## Applications

- Metro Navigation Systems
- Google Maps Transit
- Urban Transportation Planning
- Smart City Routing

## Conclusion

Transfer-aware shortest path computation provides more realistic travel-time estimates in public transportation networks.
