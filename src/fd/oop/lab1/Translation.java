package fd.oop.lab1;

public class Translation implements Transformation {
    private final double dX, dY;

    public Translation(double dX, double dY) {
        this.dX = dX;
        this.dY = dY;
    }

    @Override
    public Transformation getReverseTransformation() {
        return new Translation(-dX, -dY);
    }

    @Override
    public Point transform(Point p) {
        return new Point(p.getX() + dX, p.getY() + dY);
    }

    public double getDX() {
        return dX;
    }

    public double getDY() {
        return dY;
    }

    @Override
    public String toString() {
        return "Translation by vector (" + dX + "," + dY + ")";
    }

    public MatrixTransformation toMatrixForm() {
        return new MatrixTransformation(1, 0, this.dX, 0, 1, this.dY);
    }
}
