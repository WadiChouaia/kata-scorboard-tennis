package com.jcdeau.kata.tennis.scoreboard.scoreboard;

import org.junit.jupiter.api.Test;

import com.jcdeau.kata.tennis.scoreboard.scoreboard.Mocks.DisplayMock;
import com.jcdeau.kata.tennis.scoreboard.scoreboard.Mocks.GameMock;
import com.jcdeau.kata.tennis.scoreboard.scoreboard.Mocks.PlayerMock;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void givenPlayers_ShouldAddPointsToThem() {
        TennisGame game = new TennisGame();
        PlayerMock one = new PlayerMock();
        PlayerMock two = new PlayerMock();

        assertFalse(one.isAddPointTriggered());
        assertFalse(two.isAddPointTriggered());

        game.playRound(one, two);

        assertTrue(one.isAddPointTriggered());
        assertTrue(two.isAddPointTriggered());
    }

    @Test
    void shouldReturnTrue_GivenPlayerWithGameWonValue() {
        TennisGame game = new TennisGame();
        ScoreEvaluator evaluator = new ScoreEvaluator();
        boolean result = game.isGameWon(evaluator, 40, 15);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrue_GivenPlayerWithMoreThanGameWonValue() {
        TennisGame game = new TennisGame();
        ScoreEvaluator evaluator = new ScoreEvaluator();
        boolean result = game.isGameWon(evaluator, 41, 15);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalse_GivenPlayersWithLessThenGameWonValue() {
        TennisGame game = new TennisGame();
        ScoreEvaluator evaluator = new ScoreEvaluator();
        boolean result = game.isGameWon(evaluator, 30, 15);

        assertFalse(result);
    }

    @Test
    void shouldReturnShowDisplayWinnerAndDisplayScoreOnce_GivenWonCondition() {
        GameMock game = new GameMock();
        game.setGameWon(true);

        ScoreEvaluator evaluator = new ScoreEvaluator();
        DisplayMock display = new DisplayMock();

        Player one = new GamePlayer("one");
        one.addPoint("40");
        Player two = new GamePlayer("two");
        two.addPoint("30");

        game.play(evaluator, display, one, two);

        assertEquals(1, display.getDisplayScoreTriggeredCount());
        assertEquals(1, display.getDisplayWinnerTriggeredCount());
    }


}
