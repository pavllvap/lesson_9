package task_2;


import task_1.Vector2D;

import java.util.Arrays;

public class Vector implements Comparable {


    private int[] array;
    public final static String VECTOR = "It's vector";


    public Vector(int... array) {
        if (array.length % 2 != 0) {
            System.out.println("Количество координат должно быть четным числом");
            return;
        } else {
            this.array = array;
        }

    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int calcLength() {
        int sum = 1;
        for (int i = 1; i < this.array.length; i += 2) {
            sum *= (int) (Math.sqrt(Math.pow((array[i] - array[i - 1]), 2)));
        }
        return sum;
    }

    public static int calcScalarMultiplication(Vector vec1, Vector vec2, int angleBetweenVectors) {
        return (int) (Math.abs(vec1.calcLength()) *
                Math.abs(vec2.calcLength()) *
                Math.cos(angleBetweenVectors));
    }

    public static Vector calcSumVectors(Vector vec1, Vector vec2) {
        int[] array = new int[vec1.getArray().length];
        Vector vector = new Vector(array);
        for (int i = 0; i < vec1.getArray().length; i++) {
            vector.getArray()[i] = vec1.getArray()[i] + vec2.getArray()[i];
        }
        return vector;
    }

    public static Vector calcSubtractionVectors(Vector vec1, Vector vec2) {
        int[] array = new int[vec1.getArray().length];
        Vector vector = new Vector(array);
        for (int i = 0; i < vec1.getArray().length; i++) {
            vector.getArray()[i] = vec1.getArray()[i] - vec2.getArray()[i];
        }
        return vector;
    }

    public static Vector[] randomArrayOfVectors(int n, int m) {
        Vector[] vectors = new Vector[n];
        for (int j = 0; j < n; j++) {
            Vector vectors1 = new Vector(new int[m]);
            for (int i = 0; i < m; i++) {
                vectors1.getArray()[i] = (int) (Math.random() * 10);
            }
            vectors [j] = vectors1;
        }
        return vectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(array, vector.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }


    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.calcLength(), ((Vector) o).calcLength());
    }

    @Override
    public String toString() {
        return VECTOR + "{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
