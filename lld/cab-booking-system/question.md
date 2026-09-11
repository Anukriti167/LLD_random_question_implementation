# Cab Booking System — LLD

## Requirements

1. A customer can request a ride by providing a pickup location and destination.
2. The system should find an available cab for the customer.
3. A cab has a driver, vehicle type, and current location.
4. A customer can have only one active ride at a time.
5. A driver can accept or reject a ride request.
6. Once a driver accepts the request, the ride can begin.
7. When the customer reaches the destination, the ride is completed.
8. The fare should be calculated based on the ride.
9. The customer should be able to pay for the completed ride.
10. Completed rides should be stored as historical records.
11. Drivers can have the following states:
    - AVAILABLE
    - ON_TRIP
    - OFFLINE
12. The system should support different vehicle types:
    - HATCHBACK
    - SEDAN
    - SUV
13. The system should support different fare calculation strategies in the future.
14. Location is represented using latitude and longitude.
15. No real-time GPS, maps/routing APIs, or external payment providers are required.
