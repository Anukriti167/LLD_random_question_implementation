# ATM — LLD

## Requirements

1. A customer should be able to insert a card into the ATM.

2. The customer should enter a PIN.

3. The ATM should validate the card and PIN before allowing banking operations.

4. After successful authentication, the customer should be able to:
   - Withdraw money
   - Check account balance
   - Deposit money

5. A withdrawal should fail if:
   - The PIN is incorrect.
   - The account has insufficient balance.
   - The ATM does not have sufficient cash.

6. The ATM should maintain cash inventory for multiple denominations.

7. A successful withdrawal should:
   - Deduct the amount from the customer's account.
   - Deduct the corresponding cash from the ATM's cash inventory.

8. A successful deposit should increase the customer's account balance.

9. A balance check should return the current account balance.

10. Every banking operation should create a transaction record.

11. The transaction record should capture the relevant information about the operation.

12. The system should maintain transaction history separately from the currently executing transaction.

13. One customer can use the ATM at a time.

14. The ATM should maintain the currently authenticated card/session.

15. A customer can have one or more accounts.

16. The system should support different account types in the future, such as:
    - Savings
    - Current
    - Salary
    - Business

17. A card should be associated with an account.

18. Multiple cards may be associated with an account.

19. The system should use a single currency.

20. No external bank or network APIs are required.

21. No external payment provider is required.
