public class Main {
    public static void main(String[] args) {

        Square square = new Square(2, 5, 1);
        System.out.println(square);

        square.setCoordinate(new Point(4, 8));
        square.setSideLength(6);
        System.out.println(square);

    }
}
