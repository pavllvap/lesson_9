package task_1;

import java.util.Objects;

public class Vector3D implements Comparable {

    public final static String VECTOR = "It's 3D vector";
    private int x1;
    private int y1;
    private int z1;
    private int x2;
    private int y2;
    private int z2;

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getZ2() {
        return z2;
    }

    public void setZ2(int z2) {
        this.z2 = z2;
    }

    public int calc3DLength() {
        return (int)(Math.sqrt(Math.pow((x2 - x1), 2) * Math.pow((y2 - y1), 2) * Math.pow((z2 - z1), 2)));
    }


    public static int calcScalarMultiplication3D(Vector3D vec1, Vector3D vec2, int angleBetweenVectors) {
        return (int) (Math.abs(vec1.calc3DLength()) *
                Math.abs(vec2.calc3DLength()) *
                Math.cos(angleBetweenVectors));
    }

    public static Vector3D calcSum3DVectors(Vector3D vec1, Vector3D vec2) {
        return new Vector3D((vec1.x1 + vec2.x1), (vec1.y1 + vec2.y1), (vec1.z1 + vec2.z1),
                (vec1.x2 + vec2.x2), (vec1.y2 + vec2.y2), (vec1.z2 + vec2.z2));
    }

    public static Vector3D calcSubtraction3DVectors(Vector3D vec1, Vector3D vec2) {
        return new Vector3D((vec1.x1 - vec2.x1), (vec1.y1 - vec2.y1),(vec1.z1 - vec2.z1),
                (vec1.x2 - vec2.x2), (vec1.y2 - vec2.y2), (vec1.z2 - vec2.z2));
    }

    public static Vector3D[] randomArrayOfVectors(int n) {
        Vector3D[] array = new Vector3D[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector3D((int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10));
        }
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return x1 == vector3D.x1 && y1 == vector3D.y1 && z1 == vector3D.z1 && x2 == vector3D.x2 && y2 == vector3D.y2 && z2 == vector3D.z2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, z1, x2, y2, z2);
    }


    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.calc3DLength(), ((Vector3D) o).calc3DLength());
    }

    @Override
    public String toString() {
        return VECTOR + "{" +
                "x1=" + x1 +
                ", y1 = " + y1 +
                ", z1 = " + z1 +
                ", x2 = " + x2 +
                ", y2 = " + y2 +
                ", z2 = " + z2 +
                '}';
    }
}


