# Ludo Game — LLD

## Requirements

1. The system should support a Ludo game with multiple players.
2. Each player can have multiple pieces.
3. A piece starts at its home position.
4. Players take turns rolling a standard six-sided dice.
5. After rolling the dice, the system should determine which pieces can make a valid move.
6. The player can choose one of the valid pieces to move.
7. A piece should enter the main board only when the required dice condition is satisfied.
8. A piece should move according to the dice value and the board's movement rules.
9. A piece that reaches its final destination is considered completed.
10. When all pieces of a player are completed, that player wins the game.
11. If a piece lands on an opponent's piece, the opponent's piece is sent back to its home position.
12. Pieces on safe positions cannot be captured.
13. The game should determine whose turn it is and move to the next player after a turn.
14. Once a player wins, the game should end and no further moves should be allowed.
15. The board has a fixed layout.
16. The game should support the standard supported number of players.
17. The dice should be a standard six-sided dice.
18. The system is for a local/single game and does not require online multiplayer.
19. UI, networking, persistence, authentication, and external services are out of scope.
