package com.jcdeau.kata.tennis.scoreboard.scoreboard;

public class ScoreEvaluator {

	public static final int WINNING_SCORE = 40;
    boolean egalite;

    public GameStatus evaluateScore(int playerOneScore, int playerTwoScore) {
        if (playerOneScore == WINNING_SCORE && playerOneScore == playerTwoScore) {
            egalite = true;
            return GameStatus.EGALITE;
        }

        if ((playerOneScore == playerTwoScore ) && egalite) {
            return GameStatus.NO_WINNER;
        }

        if (playerOneScore >= WINNING_SCORE || playerTwoScore >= WINNING_SCORE) {
            return GameStatus.GAME_WON;
        }
        return GameStatus.NO_WINNER;
    }
	
}
