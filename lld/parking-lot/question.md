# Parking Lot — LLD

## Requirements

1. The parking lot should have multiple floors.

2. Each floor should contain multiple parking spots.

3. The system should support the following vehicle types:
   - Motorcycle
   - Car
   - Truck

4. The system should support the following parking spot types:
   - Small
   - Medium
   - Large

5. A vehicle can occupy only one parking spot at a time.

6. The system should determine whether a parking spot is compatible with a vehicle.

7. When a vehicle enters:
   - The system should find a suitable available parking spot.
   - If no suitable spot is available, entry should be denied.
   - If a spot is available, the vehicle should be assigned to it.
   - A parking ticket should be generated.

8. The parking ticket should identify the vehicle and parking spot and record the entry time.

9. When a vehicle exits:
   - The system should identify the parking spot using the ticket.
   - The parking fee should be calculated.
   - The customer should make the payment.
   - The parking spot should become available again.

10. Payment can be kept simple for this exercise.

11. The system should support finding available parking spots across multiple floors.

12. The system should be designed so that additional vehicle types can be supported in the future.

13. No external payment provider is required.
