package com.anukriti.tictactoe.model;

import com.anukriti.tictactoe.enums.CellStatus;
import com.anukriti.tictactoe.enums.Symbol;
import lombok.Getter;

public class Cell {
    private int row;
    private int col;

    @Getter
    private CellStatus status;

    @Getter
    private Symbol symbol;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.status = CellStatus.EMPTY;
    }

    public boolean isCellEmpty(){
        return status == CellStatus.EMPTY;
    }

    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
        this.status = CellStatus.OCCUPIED;
    }
}
