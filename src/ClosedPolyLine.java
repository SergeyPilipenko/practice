public class ClosedPolyLine extends PolyLine{
    public ClosedPolyLine(Point ...points){
        if (points[0].x != points[points.length-1].x ||
                points[0].y != points[points.length-1].y){
            throw new IllegalArgumentException("Это незамкнутая линия");
        }

       this.points = points;
    }

    @Override
    public double length() {
        return super.length();
    }
}
