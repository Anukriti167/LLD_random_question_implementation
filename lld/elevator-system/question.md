# Elevator System — LLD

## Problem Statement

Design an Elevator System for a building with multiple floors and multiple elevators.

The system should allow people to request elevators, assign appropriate elevators to requests, and handle multiple requests efficiently.

## Requirements

1. The building has multiple floors and multiple elevators.

2. Each elevator can move between the floors of the building and has a current floor and current direction.

3. An elevator can be in one of the following states:
   - `IDLE`
   - `MOVING`
   - `DOOR_OPEN`

4. A person waiting on a floor can request an elevator by providing their current floor and desired direction (`UP` or `DOWN`).

5. The system should assign an available elevator to the request.

6. An elevator that is out of service must not be assigned a request.

7. Once the assigned elevator reaches the requesting floor, its doors open and the person enters the elevator.

8. A person inside the elevator can select a destination floor.

9. The elevator then moves toward the selected destination. When it reaches the destination, the doors open and the person exits.

10. An elevator can have multiple destination requests during a single trip.

11. The system should handle requests in an appropriate order so that the elevator does not unnecessarily move back and forth.

12. The elevator must not move beyond the minimum or maximum floor of the building.

13. Multiple elevators should be able to operate independently.

14. The system should support different strategies for selecting which elevator handles a request.

15. Examples of possible elevator-selection strategies include:
    - Nearest elevator
    - Least busy elevator
    - Elevator already moving in the requested direction

16. The system should allow new elevator-selection strategies to be added without modifying the core request-handling workflow.

17. The system should also allow different strategies for determining the order in which an elevator serves its pending requests.

18. All elevators have the same capacity. Capacity limits and overload handling are out of scope.

19. Emergency/fire mode is out of scope.

20. Real-time hardware integration is out of scope.

21. UI and database/persistence are out of scope.

22. No sophisticated optimal elevator scheduling algorithm is required.

## Goal

Design the Elevator System using object-oriented principles and UML.

The design should be extensible, maintainable, and avoid unnecessary complexity.
