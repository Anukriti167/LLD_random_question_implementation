# Amazon Locker System — LLD Practice

## Requirements

Design a locker management system for an Amazon-like package delivery service.

1. The system has multiple locker locations.
2. Each locker location has multiple physical lockers.
3. Each locker has a unique ID.
4. Lockers come in different sizes: Small, Medium, and Large.
5. Packages also have sizes: Small, Medium, and Large.
6. A package can be assigned to a suitable available locker based on its size.
7. A locker can contain at most one package at a time.
8. A locker is considered occupied when a package is assigned to it.
9. A user can have multiple packages.
10. Each package belongs to one user.
11. A package has a pickup code that the user can use to collect it.
12. A user can pick up a package using the pickup code.
13. Once a package is picked up, the locker becomes available again.
14. A package has an expiration time. After the expiration time, the package should be considered expired.
15. Expired packages should not be available for pickup.
16. The system should support different strategies for selecting a locker, such as:
    - First available locker
    - Smallest suitable locker
    - Locker closest to a specified location
17. The locker-selection logic should be replaceable without changing the core package-assignment workflow.
18. A locker location has a geographical location represented by latitude and longitude.
19. The system should be able to assign a package to a suitable locker from the available lockers.
20. If no suitable locker is available, the package should not be assigned.
21. The system should support package pickup and locker release.
22. Multiple locker locations should be supported.
23. The system should be extensible to support additional locker-selection strategies in the future.
24. No database, authentication, external delivery APIs, hardware integration, or UI is required.

## Constraints

- One locker can contain only one package.
- One package can be assigned to at most one locker.
- One pickup corresponds to one package.
- Locker capacity is determined only by locker size.
- All lockers follow the same size compatibility rules.
- Keep the design focused on the above requirements; do not add functionality that is not required.

## Goal

Create a UML class diagram for the system.

Focus on:

- Identifying the domain objects.
- Assigning responsibilities to the appropriate classes.
- Deciding what state each class should own.
- Modeling relationships and multiplicities.
- Making the locker-selection behavior extensible.

Do not assume any particular design pattern unless the requirements justify it.
