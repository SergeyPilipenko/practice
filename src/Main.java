public class Main {
    public static void main(String[] args) {

        //6.2
        Point startPoint = new Point(1, 3);
        Point endPoint = new Point(5, 8);

        Line line1 = new Line(startPoint, endPoint);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.endPoint, line2.startPoint);

        System.out.println("До: Line3 - " + line3.toString());

        line3.startPoint.x = 6;
        line3.startPoint.y = 9;

        line3.endPoint.x = 11;
        line3.endPoint.x = 12;

        System.out.println("После: Line3 - " + line3.toString());

        double lengthSum = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Суммарная длина всех трех линий: " + lengthSum);
    }
}
