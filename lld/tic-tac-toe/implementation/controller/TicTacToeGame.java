package com.anukriti.tictactoe.controller;

import com.anukriti.tictactoe.model.Board;
import com.anukriti.tictactoe.model.Player;
import com.anukriti.tictactoe.state.GameState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TicTacToeGame {
    private GameState state;
    private Player currentPlayer;
    private Board board;
    private List<Player> playerList;

    public void switchPlayer(){
        for(Player player: playerList){
            if(!player.equals(currentPlayer)){
                currentPlayer = player;
                return;
            }
        }
        throw new IllegalStateException("No other player found");
    }
}
