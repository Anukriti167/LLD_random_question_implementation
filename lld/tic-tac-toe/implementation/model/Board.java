package com.anukriti.tictactoe.model;

import com.anukriti.tictactoe.enums.CellStatus;
import com.anukriti.tictactoe.enums.Symbol;

public class Board {
    private Cell [][]board;

    public Board(){
        this.board = new Cell[3][3];

        for(int row = 0; row < 3; row++){
            for(int col = 0; col<3; col++){
                this.board[row][col] = new Cell(row, col);
            }
        }
    }

    public boolean isCellEmpty(int row, int col){
        return board[row][col].isCellEmpty();
    }

    public void placeSymbol(int row, int col, Symbol symbol){
        board[row][col].setSymbol(symbol);
    }

    public boolean hasWinner(Symbol symbol) {
        //Row Wise
        for(int i=0; i<3; i++){
            boolean isWinner = true;
            for(int j=0; j<3; j++){
                if(board[i][j].getSymbol() != symbol) isWinner = false;
            }
            if(isWinner){
                return true;
            }
        }

        //Col Wise
        for(int i=0; i<3; i++){
            boolean isWinner = true;
            for(int j=0; j<3; j++){
                if(board[j][i].getSymbol() != symbol) isWinner = false;
            }
            if(isWinner){
                return true;
            }
        }

        //Diagonal Wise
        if(board[0][0].getSymbol() == symbol
                && board[1][1].getSymbol() == symbol
                &&  board[2][2].getSymbol() == symbol){
            return true;
        }
        if(board[0][2].getSymbol() == symbol
                && board[1][1].getSymbol() == symbol
                && board[2][0].getSymbol() == symbol){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j].getStatus() == CellStatus.EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
}
