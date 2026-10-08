package com.anukriti.tictactoe.state;

import com.anukriti.tictactoe.controller.TicTacToeGame;

public class DrawState implements GameState{
    @Override
    public void nextMove(TicTacToeGame game, int row, int col) {
        throw new IllegalStateException("Game has already ended");
    }
}
