package oops.inheritance.method_overriding;

public class Main {
    public static void main(String[] args) {

        var point = new Point(1, 1);
        System.out.println(point.toString());
        System.out.println(point);

        var point1 = new Point(2, 2);
        var point2 = new Point(2, 2);
        Point point3 = null;
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        System.out.println(point.equals(point));

    }
}
