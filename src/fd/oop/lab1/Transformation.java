package fd.oop.lab1;

public interface Transformation {
    Point transform(Point p);

    Transformation getReverseTransformation()
            throws NoReverseTransformationException;
}
