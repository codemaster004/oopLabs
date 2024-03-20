package fd.oop.lab1;

public class MatrixTransformation implements Transformation {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;

    MatrixTransformation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public Point transform(Point p) {
        return new Point(
                a * p.getX() + b * p.getY() + c,
                d * p.getX() + e * p.getY() + f
        );
    }

    @Override
    public Transformation getReverseTransformation() throws NoReverseTransformationException {
        if (b-d+e*a == 0 || e*a-b*d == 0) {
            throw new NoReverseTransformationException("There is no reverse for this matrix");
        }
        return new MatrixTransformation(
                e / (b-d+e*a),
                (-b)/(b-d+e*a),
                (b*f-e*c)/(b-d+e*a),
                (-d)/(e*a-b*d),
                (a)/(b-d+e*a),
                (c*d-a*f)/(b-d+e*a)
        );
    }
}
