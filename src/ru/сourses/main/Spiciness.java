package ru.сourses.main;

public enum Spiciness {
    VERY_SPICY("Очень острый"),
    SPICY("Острый"),
    NOT_SPICY("Не острый");

    private final String name;

    Spiciness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
