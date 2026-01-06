package ru.сourses.main;

import ru.сourses.geometry.Point;
import ru.сourses.geometry.PolyLine;

public class Main {
    public static void main(String[] args) {
        PolyLine p1 = new PolyLine(new Point(1, 2),
                new Point(2, 3),
                new Point(3, 4));

        PolyLine p2 = new PolyLine(new Point(1, 2),
                new Point(2, 3),
                new Point(3, 4));

        PolyLine p3 = new PolyLine(new Point(1, 2),
                new Point(2, 3),
                new Point(4, 4));

        PolyLine pClone = p1.clone();

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(pClone));
    }
}
