package ru.сourses.main;

import ru.сourses.geometry.Line;
import ru.сourses.geometry.Point;

public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1, 2),
                new Point(2, 3));
        Line l2 = new Line(1, 2, 2, 3);
        Line lClone = l1.clone();

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(lClone));
    }
}
