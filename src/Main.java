public class Main {
    public static void main(String[] args) {

        //6.3
        PolyLine polyLine = new PolyLine(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(9, 9));

        System.out.println(polyLine);
        System.out.println("Длина ломанной: " + polyLine.getLength());

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(9, 9),
                new Point(1, 5));

        System.out.println(closedPolyLine);
        System.out.println("Длина замкнутой ломанной: " + closedPolyLine.getLength());

        System.out.println("-----printMeasurable-----");
        printMeasurable(polyLine);
        printMeasurable(closedPolyLine);
    }

    static void printMeasurable(Measurable obj) {
        System.out.println(obj);
        System.out.println("Длина: " + obj.getLength());
    }
}

interface Measurable {
    double getLength();
}
