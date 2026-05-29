# DynamoDB GSI Partition-Key Range Scan

## Overview

This project demonstrates how DynamoDB Global Secondary Indexes (GSIs) support efficient range queries.

## Scenario

A table contains 100 million users.

Primary Key:

user_id

Global Secondary Index:

Partition Key : country_code
Sort Key      : signup_date

Query:

Find all users in India (IN) who signed up during the last 30 days.

## Key Concepts

- DynamoDB Partitioning
- Hash-Based Distribution
- Global Secondary Index (GSI)
- Equality Match on Partition Key
- Range Query on Sort Key

## Why GSI?

Without GSI:

Full Table Scan → O(N)

With GSI:

Partition Lookup + Range Scan → O(log n + k)

## Technologies Used

- Java
- DynamoDB Concepts
- GSI Query Simulation

## Sample Output

Users in IN who signed up in last 30 days:

U101 IN 2026-05-01
U103 IN 2026-05-12
U104 IN 2026-05-20
U106 IN 2026-05-28

Total Matching Users = 4

## Conclusion

Global Secondary Indexes provide efficient alternate access patterns and eliminate expensive full-table scans.
