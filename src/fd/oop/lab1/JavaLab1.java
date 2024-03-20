package fd.oop.lab1;

import java.util.Scanner;


public class JavaLab1 {
    public static void main(String[] args) {
        try {
            Point p1 = Point.E_X;
            System.out.println(p1);
            Transformation tr = new Translation(5, 6).toMatrixForm();
            System.out.println(tr);
            Point p2 = tr.transform(p1);
            System.out.println(p2);
            Transformation trr = tr.getReverseTransformation();
            System.out.println(trr);
            Point p3 = trr.transform(p2);
            System.out.println(p3);
        } catch (NoReverseTransformationException ex) {
            ex.printStackTrace();
        }
        System.out.println();

        try {
            Point p1 = new Point(2, 2);
            System.out.println(p1);
            Transformation tr2 = new Scaling(5, 4).toMatrixForm();
            System.out.println(tr2);
            Point p2 = tr2.transform(p1);
            System.out.println(p2);
            Transformation trr2 = tr2.getReverseTransformation();
            System.out.println(trr2);
            Point p3 = trr2.transform(p2);
            System.out.println(p3);
        } catch (NoReverseTransformationException ex) {
            ex.printStackTrace();
        }
        System.out.println();

        try {
            Point p1 = new Point(2, 2);
            System.out.println(p1);
            Transformation rt1 = new Rotation(1).toMatrixForm();
            System.out.println(rt1);
            Point p2 = rt1.transform(p1);
            System.out.println(p2);
            Transformation rrt1 = rt1.getReverseTransformation();
            System.out.println(rrt1);
            Point p3 = rrt1.transform(p2);
            System.out.println(p3);
        } catch (NoReverseTransformationException ex) {
            ex.printStackTrace();
        }
        System.out.println();

        try {
            Point p1 = new Point(2, 2);
            Transformation tr2 = new Scaling(5, 0).toMatrixForm();
            System.out.println(tr2);
            System.out.println(p1);
            Point p2 = tr2.transform(p1);
            System.out.println(p2);
            Transformation trr2 = tr2.getReverseTransformation();
            System.out.println(trr2);
            Point p3 = trr2.transform(p2);
            System.out.println(p3);
        } catch (NoReverseTransformationException ex) {
            ex.printStackTrace();
        }
        System.out.println();

        Point mPoint = new Point(1, 1);
        Translation tr3 = new Translation(2, 2);
        System.out.println(tr3);
        Point p4 = tr3.transform(mPoint);
        System.out.println(p4);
        Transformation mtr = tr3.toMatrixForm();
        Point mp4 = mtr.transform(mPoint);
        System.out.println(mp4);

        System.out.println();

    }
}
