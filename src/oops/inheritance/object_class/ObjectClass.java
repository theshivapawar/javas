package oops.inheritance.object_class;

public class ObjectClass {
    public static void main(String[] args) {

        var object = new Object();

        var point1 = new Point(1, 1);
        var point2 = point1;
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point1.equals(point2));

        var point3 = new Point(2, 2);
        var point4 = new Point(2, 2);
        System.out.println(point3.hashCode());
        System.out.println(point4.hashCode());
        System.out.println(point3.equals(point4));

        var point = new Point(3, 3);
        System.out.println(point);

        System.out.println(point.getClass().getSimpleName());
        System.out.println(point.getClass().getPackageName());
        System.out.println(point.getClass().getName());
    }
}
