package fd.oop.lab1;

public class Rotation implements Transformation {
    private final double alpha;

    public Rotation(double alpha) {
        this.alpha = alpha;
    }

    @Override
    public Transformation getReverseTransformation() throws NoReverseTransformationException {
        return new Rotation(-alpha);
    }

    @Override
    public Point transform(Point p) {
        double x = p.getX();
        double y = p.getY();
        double newX = x * Math.cos(alpha) - y * Math.sin(alpha);
        double newY = x * Math.sin(alpha) + y * Math.cos(alpha);
        return new Point(newX, newY);
    }

    public double getAlpha() {
        return alpha;
    }

    @Override
    public String toString() {
        return "Rotation (alpha=" + alpha + ")";
    }

    public MatrixTransformation toMatrixForm() {
        return new MatrixTransformation(Math.cos(alpha), -Math.sin(alpha), 0, Math.sin(alpha), Math.cos(alpha), 0);
    }
}
