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
        String winning = "";
        if(handSign.equals("rock")) {
            winning = "paper";
        } else if(handSign.equals("paper")) {
            winning = "scissors";
        } else if(handSign.equals("scissors")) {
            winning = "rock";
        }
        return winning;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losing = "";
        if(handSign.equals("rock")) {
            losing = "scissors";
        } else if(handSign.equals("paper")) {
            losing = "rock";
        } else if(handSign.equals("scissors")) {
            losing = "paper";
        }
        return losing;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner= "";
        if(handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissor")){
            winner = "rock";
        } else if (handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("paper")) {
            winner = "scissor";
        } else if (handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")) {
            winner = "paper";
        } else if (handSignOfPlayer2.equals("rock") && handSignOfPlayer1.equals("scissor")){
            winner = "rock";
        } else if (handSignOfPlayer2.equals("scissors") && handSignOfPlayer1.equals("paper")) {
            winner = "scissor";
        } else if (handSignOfPlayer2.equals("paper") && handSignOfPlayer1.equals("rock")) {
            winner = "paper";
        }
        return winner;
    }
}
