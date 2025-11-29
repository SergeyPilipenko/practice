public class Square {

    private Point coordinate;
    private int sideLength;

    public Square(int coordinateX, int coordinateY, int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть > 0");
        }

        this.coordinate = new Point(coordinateX, coordinateY);
        this.sideLength = sideLength;
    }

    public Point getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке %s со стороной %s",
                coordinate.toString(), sideLength);
    }
}
