package ru.сourses.main;

import ru.сourses.geometry.Point;

public class Main {
    public static void main(String[] args) throws Exception {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(1, 3);
        Point pClone = p1.clone();

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(pClone));
    }
}
