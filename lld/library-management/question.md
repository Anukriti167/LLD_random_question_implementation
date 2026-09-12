# Library Management System — LLD

## Requirements

1. The library has multiple books.

2. Each book has:
   - Book ID
   - Title
   - Author
   - ISBN

3. The library can have multiple physical copies of the same book.

4. Each physical copy should have its own unique identifier.

5. A registered member can search for books by:
   - Title
   - Author
   - ISBN

6. A member can borrow an available physical copy of a book.

7. A member cannot borrow a book if no physical copy is available.

8. A borrowed book has a due date.

9. A member can return a borrowed book.

10. When a book is returned, its physical copy becomes available again.

11. The system should track which member currently has a borrowed copy.

12. A member can borrow multiple books, subject to a maximum borrowing limit.

13. The maximum number of books a regular member can borrow is **5**.

14. The system should calculate a fine when a book is returned after its due date.

15. Fine calculation should be based on the number of overdue days.

16. The library should support different fine calculation policies in the future.

17. A member should be able to pay an outstanding fine.

18. The system should maintain borrowing history for members.

19. The system should support different member types in the future, such as:
   - Regular Member
   - Premium Member

20. Different member types may have different borrowing limits in the future.

21. Assume there is only one library branch.

22. No external payment provider or notification service is required.

---

## Constraints

- No database design is required.
- No authentication/authorization is required.
- No reservation/waitlist functionality is required.
- No book recommendation functionality is required.
- No external APIs are required.

---

## Design Goals

The design should be:

- Extensible for new member types.
- Extensible for new fine calculation policies.
- Easy to maintain.
- Clear about ownership of state and responsibilities.
- Avoid unnecessary design patterns or abstractions.

---
