import java.util.ArrayList;
import java.util.Arrays;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... pointsArr) {
        if (pointsArr[0].x != pointsArr[pointsArr.length - 1].x ||
                pointsArr[0].y != pointsArr[pointsArr.length - 1].y) {
            throw new IllegalArgumentException("Это незамкнутая линия");
        }

        this.pointsArr = pointsArr;
        this.linesArr = new ArrayList<>();

        for (int i = 0; i < pointsArr.length - 1; i++) {
            Line line = new Line(pointsArr[i], pointsArr[i + 1]);
            linesArr.add(line);
        }
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Замкнутая Линия " + Arrays.toString(pointsArr);
    }
}
