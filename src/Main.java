public class Main {
    public static void main(String[] args) {

        //8.2
        Point point1 = new Point(1, 3);
        Point point2 = new Point(2, 4);
        Point point3 = new Point(3, 5);

        PolyLine polyLine = new PolyLine(point1,point2, point3);
        System.out.println(polyLine.length());

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(point1,point2, point3,point1);
        System.out.println(closedPolyLine.length());

    }

}
