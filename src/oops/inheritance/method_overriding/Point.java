package oops.inheritance.method_overriding;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Point point)) return false;
        return (x == point.x && y == point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /*
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Point point)) return false;
        return hashCode() == point.hashCode();
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(String.format("%d%d", x, y));
    }
    */

    /*
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        var point = (Point) object;
        return (x == point.x && y == point.y);
    }
    */

    /*
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof Point point) {
            return (x == point.x && y == point.y);
        }
        return false;
    }
    */

    /*
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object != null && getClass() == object.getClass()) {
            var point = (Point) object;
            return (x == point.x && y == point.y);
        }
        return false;
    }
    */


}
