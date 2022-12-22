package task_1;

import java.util.Comparator;
import java.util.Objects;

public class Vector2D implements Comparable {


    public final static String VECTOR = "It's 2D vector";
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Vector2D(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int calc2DLength() {
        return (int)(Math.sqrt(Math.pow((x2 - x1), 2) * Math.pow((y2 - y1), 2)));
    }



    public static int calcScalarMultiplication2D(Vector2D vec1, Vector2D vec2, int angleBetweenVectors) {
        return (int) (Math.abs(vec1.calc2DLength()) *
                        Math.abs(vec2.calc2DLength()) *
                        Math.cos(angleBetweenVectors));
    }

    public static Vector2D calcSumVectors(Vector2D vec1, Vector2D vec2) {
        return new Vector2D((vec1.x1 + vec2.x1), (vec1.y1 + vec2.y1), (vec1.x2 + vec2.x2), (vec1.y2 + vec2.y2));
    }

    public static Vector2D calcSubtractionVectors(Vector2D vec1, Vector2D vec2) {
        return new Vector2D((vec1.x1 - vec2.x1), (vec1.y1 - vec2.y1), (vec1.x2 - vec2.x2), (vec1.y2 - vec2.y2));
    }

    public static Vector2D[] randomArrayOfVectors(int n) {
        Vector2D[] array = new Vector2D[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector2D((int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10));
        }
        return array;
    }

    @Override
    public String toString() {
        return VECTOR + "{" +
                " x1 = " + x1 +
                ", y1 = " + y1 +
                ", x2 = " + x2 +
                ", y2 = " + y2 +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return x1 == vector2D.x1 && y1 == vector2D.y1 && x2 == vector2D.x2 && y2 == vector2D.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.calc2DLength(), ((Vector2D) o).calc2DLength());
    }
}
