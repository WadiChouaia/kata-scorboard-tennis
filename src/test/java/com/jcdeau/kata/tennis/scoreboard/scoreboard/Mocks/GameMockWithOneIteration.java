package com.jcdeau.kata.tennis.scoreboard.scoreboard.Mocks;

import com.jcdeau.kata.tennis.scoreboard.scoreboard.Game;
import com.jcdeau.kata.tennis.scoreboard.scoreboard.Player;
import com.jcdeau.kata.tennis.scoreboard.scoreboard.ScoreEvaluator;

public class GameMockWithOneIteration implements Game {
    boolean isGameWonTriggered;
    int rounds;

    @Override
    public boolean isGameWon(ScoreEvaluator evaluator, int playerOnePoints, int playerTwoPoints) {
        if (isGameWonTriggered) {
            return true;
        }
        isGameWonTriggered = true;
        return false;
    }

    @Override
    public void playRound(Player one, Player two) {
        rounds++;
    }

    public int getRounds() {
        return rounds;
    }
}
