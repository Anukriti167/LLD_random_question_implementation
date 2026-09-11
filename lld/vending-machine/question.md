# Vending Machine — LLD

## Requirements

1. The vending machine should allow a customer to purchase a product.

2. The machine should maintain an inventory of available products and their quantities.

3. Each product should have:
   - Product ID
   - Name
   - Price

4. A customer should be able to select a product.

5. The system should verify that the selected product is available in inventory.

6. If the product is unavailable, the purchase should not proceed.

7. The customer should be able to make a payment for the selected product.

8. If the payment is successful:
   - The product should be dispensed.
   - The inventory quantity should be reduced.
   - A completed purchase should be recorded.

9. A customer should be able to cancel an ongoing transaction before the purchase is completed.

10. The system should maintain the state of the current transaction separately from completed purchase history.

11. Completed purchases should retain the information necessary to represent what was purchased, including:
    - Product
    - Price
    - Machine
    - Purchase time

12. Inventory quantity belongs to the vending machine/inventory, not to the Product itself.

13. The system should support multiple vending machines.

14. No external payment provider is required.
