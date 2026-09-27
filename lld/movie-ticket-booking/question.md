# Movie Ticket Booking System — LLD

## Problem Statement

Design a Movie Ticket Booking System for a cinema chain.

The system should allow users to search for movies, view available shows, select seats, make bookings, make payments, and access their booking history.

## Requirements

1. The system has multiple cinemas.

2. Each cinema can have multiple screens.

3. Each screen has a fixed set of physical seats.

4. Each seat has a unique identifier and belongs to a seat type:
   - Regular
   - Premium
   - Recliner

5. Different seat types can have different base prices.

6. A movie has a name and release date.

7. A movie can have multiple shows at different times and on different screens.

8. A user should be able to search for movies and view their release information.

9. A user should be able to view available shows for a movie.

10. A user can select a show and choose one or more seats for that show.

11. A seat can be booked by only one user for a particular show.

12. The same physical seat can be available for one show and booked for another show on the same screen.

13. The system must prevent two users from successfully booking the same seat for the same show.

14. A user can select multiple seats as part of a single booking.

15. A booking should have the following states:
    - `PENDING`
    - `CONFIRMED`
    - `CANCELLED`

16. The system should calculate the total price of a booking based on the selected seats.

17. The system should support different pricing rules in the future.

18. Examples of pricing rules include:
    - Standard pricing
    - Tuesday discount
    - New-release surge pricing

19. Pricing rules may depend on information such as seat type and the show date/time.

20. A confirmed booking should generate a ticket containing the relevant historical booking information.

21. For this system, one booking containing multiple seats generates one ticket.

22. A user can have multiple bookings and should be able to access their booking history.

23. A booking can be cancelled.

24. When a booking is cancelled, the seats associated with that booking should become available again for that show.

25. The system should represent payment for a booking.

26. Payment can either succeed or fail.

27. Integration with external payment providers is out of scope.

28. Authentication and authorization are out of scope.

29. Notifications are out of scope.

30. Recommendations are out of scope.

31. UI implementation is out of scope.

32. Database and persistence implementation are out of scope.

33. Assume a single currency.

## Concurrency

34. Multiple users may attempt to book the same seat for the same show at the same time.

35. The system must ensure that at most one booking can successfully reserve a particular seat for a particular show.

## Goal

Design the Movie Ticket Booking System using object-oriented principles and UML.

Focus on:

- Responsibility allocation
- State ownership
- Object relationships and multiplicities
- Encapsulation
- Extensibility
- Handling the booking lifecycle
- Avoiding unnecessary abstractions and overengineering
