package com.jcdeau.kata.tennis.scoreboard.scoreboard.Mocks;

import com.jcdeau.kata.tennis.scoreboard.scoreboard.Display;
import com.jcdeau.kata.tennis.scoreboard.scoreboard.Player;

public class DisplayMock implements Display {
    int displayScoreTriggeredCount;
    int displayWinnerTriggeredCount;

    @Override
    public void displayScore(Player playerOne, Player playerTwo) {
        displayScoreTriggeredCount++;
    }

    @Override
    public void displayWinner(Player playerOne, Player playerTwo) {
        displayWinnerTriggeredCount++;
    }

    public int getDisplayScoreTriggeredCount() {
        return displayScoreTriggeredCount;
    }

    public int getDisplayWinnerTriggeredCount() {
        return displayWinnerTriggeredCount;
    }
}
