package com.anukriti.tictactoe.model;

import com.anukriti.tictactoe.enums.Symbol;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Player {
    private String id;
    private Symbol symbol;
}
