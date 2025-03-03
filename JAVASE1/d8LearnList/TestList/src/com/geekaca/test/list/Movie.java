package com.geekaca.test.list;

public class Movie {
    private String name;
    private String actor;
    private int year;
    private double score;

    public Movie() {
    }

    public Movie(String name, String actor, int year, double score) {
        this.name = name;
        this.actor = actor;
        this.year = year;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", year=" + year +
                ", score=" + score +
                '}';
    }
}
