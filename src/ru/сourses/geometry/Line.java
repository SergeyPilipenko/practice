package ru.сourses.geometry;

import java.util.Objects;

public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(int startX, int startY, int endX, int endY) {
        this.startPoint = new Point(startX, startY);
        this.endPoint = new Point(endX, endY);
    }

    public double getLength() {

        int deltaX = this.endPoint.x - this.startPoint.x;
        int deltaY = this.endPoint.y - this.startPoint.y;
        double length = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        return Math.round(length * 1000) / 1000d;
    }

    @Override
    public String toString() {
        return "Линия от " + this.startPoint.toString() + " до " + this.endPoint.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(startPoint, line.startPoint) && Objects.equals(endPoint, line.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }
}
