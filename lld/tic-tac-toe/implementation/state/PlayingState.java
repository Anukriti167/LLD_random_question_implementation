package com.anukriti.tictactoe.state;

import com.anukriti.tictactoe.controller.TicTacToeGame;
import com.anukriti.tictactoe.enums.Symbol;
import com.anukriti.tictactoe.model.Board;
import com.anukriti.tictactoe.model.Player;

import java.util.List;

public class PlayingState implements GameState{
    @Override
    public void nextMove(TicTacToeGame game, int row, int col) {
        validate(game.getBoard(), row, col);

        //Get current symbol
        Symbol symbol = game.getCurrentPlayer().getSymbol();

        //Place Symbol
        game.getBoard().placeSymbol(row, col, symbol);

        //Check if this symbol is winner
        if(game.getBoard().hasWinner(symbol)){
            game.setState(new WinnerState());
            return;
        }

        //Check if board is full
        if(game.getBoard().isFull()){
            game.setState(new DrawState());
            return;
        }

        //Switch Player and continue Game
        game.switchPlayer();
    }

    public void validate(Board board, int row, int col){
        if(row < 0 || col < 0 || row >= 3 || col >= 3){
            throw new IllegalArgumentException("Position out of Board");
        }

        if(!board.isCellEmpty(row, col)){
            throw new IllegalStateException("Position already occupied");
        }
    }
}
