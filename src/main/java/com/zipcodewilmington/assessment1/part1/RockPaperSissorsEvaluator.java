package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String x = "";
        if(handSign.equals(ROCK)){
            x = PAPER;
        } else if(handSign.equals(PAPER)){
            x = SCISSOR;
        } else{
            x = ROCK;
        }
        return x;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String x = "";
        switch(handSign){
            case ROCK:
                x = SCISSOR;
                break;
            case PAPER:
                x = ROCK;
                break;
            case SCISSOR:
                x = PAPER;
                break;
        }
        return x;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String x = "";
        if (getWinningMove(handSignOfPlayer1).equalsIgnoreCase(handSignOfPlayer2)) {
            x = handSignOfPlayer2;
        } else {
            x = handSignOfPlayer1;
        }
        return x;
    }
}
