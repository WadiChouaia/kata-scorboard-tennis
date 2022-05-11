package com.jcdeau.kata.tennis.scoreboard.scoreboard;

import org.junit.jupiter.api.Test;

import static com.jcdeau.kata.tennis.scoreboard.scoreboard.ScoreEvaluator.WINNING_SCORE;
import static org.junit.jupiter.api.Assertions.*;

class ScoreEvaluatorTest {

    @Test
    void givenEgaliteConditions_ShouldReturnEgaliteAndSetEgaliteToTrue() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.EGALITE;
        GameStatus result = evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);

        assertEquals(expected, result);
        assertTrue(evaluator.egalite);
    }

    @Test
    void givenPlayerOneWinScoreWithoutEgalite_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(WINNING_SCORE, 30);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerOneWithHigherWinScoreWithoutEgalite_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(WINNING_SCORE + 1, 30);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerTwoWinScoreWithoutEgalite_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(30, WINNING_SCORE);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerTwoWithHigherWinScoreWithoutEgalite_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(30, WINNING_SCORE + 1);

        assertEquals(expected, result);
    }

    @Test
    void givenEgalitedAndEquality_ShouldReturnNoWinner() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.NO_WINNER;
        evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);

        GameStatus result = evaluator.evaluateScore(55, 55);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerOneWinnerAfterEgalite_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;

        makeItEgalite(evaluator);

        GameStatus result = evaluator.evaluateScore(60, 55);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerOneWinner_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.NO_WINNER;

        GameStatus result = evaluator.evaluateScore(15, 15);

        assertEquals(expected, result);
    }


    @Test
    void givenPlayerTwoWinnerAfterEgalite_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);

        GameStatus result = evaluator.evaluateScore(55, 60);

        assertEquals(expected, result);
    }

    private void makeItEgalite(ScoreEvaluator evaluator) {
        evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);
    }
}
