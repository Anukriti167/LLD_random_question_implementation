# Tic-Tac-Toe — LLD

## Requirements

1. The system should support a Tic-Tac-Toe game between two players.
2. The game is played on a 3×3 board.
3. Each player is assigned a distinct symbol: `X` or `O`.
4. Players take turns placing their symbol on an empty cell.
5. A player cannot place a symbol on an already occupied cell.
6. The system should validate whether a requested move is valid.
7. A player wins when they have three symbols in the same row, column, or diagonal.
8. If all cells are occupied and nobody wins, the game ends in a draw.
9. Once the game ends, no further moves should be allowed.
10. The system should track the current player.
11. The system should support starting a new game.
12. The board size is fixed at 3×3.
13. The game is local/single-game.
14. The system should maintain the state of each cell.
15. The system should support the game states required to represent an ongoing game, a won game, and a drawn game.
16. The design should allow the game flow to transition between these states appropriately.
17. UI, persistence, networking, authentication, and online multiplayer are out of scope.
