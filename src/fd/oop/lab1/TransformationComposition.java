package fd.oop.lab1;

public class TransformationComposition implements Transformation {
    Transformation[] transforms = null;
    TransformationComposition(int length) {
        transforms = new Transformation[length];
    }

    public void setTransforms(Transformation[] transforms) {
        this.transforms = transforms;
    }

    public void setTransform(int index, Transformation transformation) {
        if (index < transforms.length) {
            transforms[index] = transformation;
        }
    }

    @Override
    public Point transform(Point p) {
        return null;
    }

    @Override
    public Transformation getReverseTransformation() throws NoReverseTransformationException {
        return null;
    }
}
