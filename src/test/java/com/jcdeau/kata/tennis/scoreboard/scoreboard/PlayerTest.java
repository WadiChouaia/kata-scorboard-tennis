package com.jcdeau.kata.tennis.scoreboard.scoreboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    
    @Test
    void givenStringPoint_ShouldReturnIntPoint() {
        GamePlayer player = new GamePlayer();

        int expected = 15;
        int result = player.evaluatePoint("15");

        assertEquals(expected, result);
    }

    @Test
    void givenPlayer_ShouldCalculateItsPoints() {
        GamePlayer player = new GamePlayer();
        player.addPoint("15");
        player.addPoint("30");

        int expected = 45;
        int result = player.calculatePoints();

        assertEquals(expected, result);
    }
}