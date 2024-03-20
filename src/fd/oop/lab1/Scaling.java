package fd.oop.lab1;

public class Scaling implements Transformation {

    private final double scaleX, scaleY;

    public Scaling(double scaleX, double scaleY) {
        this.scaleX = scaleX;
        this.scaleY = scaleY;
    }

    @Override
    public Transformation getReverseTransformation() throws NoReverseTransformationException {
        if (scaleX == 0 || scaleY == 0)
            throw new NoReverseTransformationException("There is no reverse transformation. At least one of scaling factors equals to 0.");
        return new Scaling(1 / scaleX, 1 / scaleY);
    }

    @Override
    public Point transform(Point p) {
        return new Point(scaleX * p.getX(), scaleY * p.getY());
    }

    public double getScaleX() {
        return scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    @Override
    public String toString() {
        return "Scaling " + scaleX + "x and " + scaleY + "y";
    }

    public MatrixTransformation toMatrixForm() {
        return new MatrixTransformation(scaleX, 0, 0, 0, scaleY, 0);
    }
}
