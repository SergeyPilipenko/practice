package ru.сourses.main;

public class Sauce {
    String name;
    Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return String.format("Соус %s: %s", name,spiciness.getName());
    }
}