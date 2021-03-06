package com.jcdeau.kata.tennis.scoreboard.scoreboard;

import java.util.ArrayList;
import java.util.List;

public class GamePlayer implements Player {
    String name;
    final List<String> points = new ArrayList<>();

    public GamePlayer() {
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public void addPoint(String point) {
        points.add(point);
    }

    public int calculatePoints() {
        return points.stream()
                .map(this::evaluatePoint).mapToInt(Integer::intValue).sum();
    }

    int evaluatePoint(String point) {
        return Integer.parseInt(point);
    }

    public String getName() {
        return name;
    }

    public List<String> getPoints() {
        return points;
    }
}
