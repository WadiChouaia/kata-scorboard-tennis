package com.jcdeau.kata.tennis.scoreboard.scoreboard.Mocks;

import java.util.List;

import com.jcdeau.kata.tennis.scoreboard.scoreboard.Player;

public class PlayerMock implements Player {
    boolean addPointTriggered;

    @Override
    public void addPoint(String point) {
        addPointTriggered = true;
    }

    @Override
    public int calculatePoints() {
        return 0;
    }

    @Override
    public List<String> getPoints() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public boolean isAddPointTriggered() {
        return addPointTriggered;
    }
}
