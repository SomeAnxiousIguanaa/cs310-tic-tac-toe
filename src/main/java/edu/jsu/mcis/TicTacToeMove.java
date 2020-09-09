package edu.jsu.mcis;

public class TicTacToeMove {
    
    private final int row;
    private final int col;

    public TicTacToeMove(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }   
}