# Coffee Machine — Low-Level Design

## Requirements

1. The coffee machine supports multiple beverage types, including Espresso, Cappuccino, and Latte.
2. Each beverage has a price and requires specific quantities of ingredients.
3. Ingredients include coffee, milk, and sugar.
4. The machine maintains an inventory of available ingredients.
5. A user can place an order for a beverage.
6. An order contains one beverage.
7. Before processing an order, the machine checks whether sufficient ingredients are available.
8. If ingredients are insufficient, the order cannot proceed.
9. The user must make a payment for the order.
10. Payment can either succeed or fail.
11. If payment fails, the order must not proceed to preparation.
12. Once payment succeeds, the machine prepares the selected beverage.
13. Preparing a beverage consumes the required ingredient quantities from inventory.
14. Each beverage type has its own preparation procedure.
15. The machine tracks the order status throughout its lifecycle.
16. The machine tracks payment status separately from order status.
17. The beverage price may change over time, but an existing order must retain the price applicable when it was placed.
18. The design should allow new beverage types to be added without significantly changing the existing order-processing workflow.
19. The machine should prevent ingredient inventory from becoming negative.
20. Assume a single coffee machine, one currency, and no external payment gateway.
21. User authentication, UI, persistence, and notifications are out of scope.

## Focus Areas

Design the classes, relationships, responsibilities, and state transitions. Avoid introducing abstractions unless they are justified by the requirements.
