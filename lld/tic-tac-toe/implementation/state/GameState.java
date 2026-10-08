package com.anukriti.tictactoe.state;

import com.anukriti.tictactoe.controller.TicTacToeGame;

public interface GameState {
    public void nextMove(TicTacToeGame game, int row, int col);
}
