import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Serg", 2, 5, 5);
        Student student2 = new Student("Petr");
        System.out.println("Студент1-> " + student1);
        System.out.println("Студент2-> " + student2);

        student1.addGrade(4);
        student2.addGrade(5);

        int[] grades1 = student1.getGrades();
        int[] grades2 = student2.getGrades();
        System.out.println("Оценки1-> " + Arrays.toString(grades1));
        System.out.println("Оценки2-> " + Arrays.toString(grades2));

        Square square = new Square(2, 5, 1);
        System.out.println(square);

        square.setCoordinate(new Point(4, 8));
        square.setSideLength(6);
        System.out.println(square);

        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        Fraction frSum = f1.sum(f2).sum(f3).minus(5);
        System.out.println(frSum.toString());
        //6.3
        PolyLine polyLine = new PolyLine(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(9, 9));

        System.out.println("До PolyLine: " + polyLine.toString());
        System.out.println("Длина ломанной: " + polyLine.getLength());

        Line[] lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));

        double lengthSum = 0;

        for (Line line : lines) {
            lengthSum += line.getLength();
        }
        System.out.println("Суммарная длина линий: " + lengthSum);
        System.out.println("Длина ломанной равна суммарной длине линий: " + (polyLine.getLength() == lengthSum));

        polyLine.pointsArr[1].x = 12;

        System.out.println("После PolyLine: " + polyLine.toString());
        lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));
    }
}
