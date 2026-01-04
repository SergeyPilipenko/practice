import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolyLine implements Measurable {

    Point[] pointsArr;
    List<Line> linesArr;

    public PolyLine() {
    }

    public PolyLine(Point... pointsArr) {
        //ошибка, если меньше 2х точек
        if (pointsArr.length < 2) {
            throw new IllegalArgumentException("Нельзя создать линию с одной точкой");
        }

        this.pointsArr = pointsArr;
        this.linesArr = new ArrayList<>();

        for (int i = 0; i < pointsArr.length - 1; i++) {
            Line line = new Line(pointsArr[i], pointsArr[i + 1]);
            linesArr.add(line);
        }
    }

    public Line[] getLines() {
        return linesArr.toArray(new Line[0]);
    }

    public double getLength() {
        double length = 0;
        for (Line line : linesArr) {
            length += line.getLength();
        }

        return Math.round(length * 1000) / 1000d;
    }

    @Override
    public String toString() {
        return "Ломанная Линия " + Arrays.toString(pointsArr);
    }
}
