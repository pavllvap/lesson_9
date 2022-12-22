package task_1;

import task_2.Vector;

import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.deepToString;

public class Test {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(4, 5, 7, 9);
        out.println(vector1.calc2DLength());
        Vector2D vector2 = new Vector2D(4, 5, 7, 9);
        out.println(vector2.calc2DLength());
        out.println(Vector2D.calcScalarMultiplication2D(vector1, vector2, 30));
        Vector2D vector3 = Vector2D.calcSumVectors(vector1, vector2);
        out.println(vector3);
        Vector2D vector4 = Vector2D.calcSubtractionVectors(vector1, vector2);
        out.println(vector4);
        out.println(Arrays.toString(Vector2D.randomArrayOfVectors(5)));
        out.println(vector1.equals(vector2));
        out.println(vector1.compareTo(vector2));
        out.println("-------------------------------------------------------");
        Vector3D vector3D1 = new Vector3D(4, 5, 6, 7, 8, 9);
        out.println(vector3D1.calc3DLength());
        Vector3D vector3D2 = new Vector3D(4, 5, 6, 7, 8, 9);
        out.println(vector3D2.calc3DLength());
        out.println(Vector3D.calcScalarMultiplication3D(vector3D1, vector3D2, 30));
        Vector3D vector3D3 = Vector3D.calcSum3DVectors(vector3D1, vector3D2);
        out.println(vector3D3);
        Vector3D vector3D4 = Vector3D.calcSubtraction3DVectors(vector3D1, vector3D2);
        out.println(vector3D4);
        out.println(Arrays.toString(Vector3D.randomArrayOfVectors(5)));
        out.println(vector3D1.equals(vector3D2));
        out.println(vector3D1.compareTo(vector3D2));
        out.println("-------------------------------------------------------");


        Vector vector = new Vector(7,8,9,12,14,16);
        out.println(vector);
        out.println(vector.calcLength());


        Vector vector0 = new Vector(9,6,8,10,12,20);
        out.println(vector0);
        out.println(vector0.calcLength());
        out.println(Vector.calcScalarMultiplication(vector, vector0, 45));

        out.println(Vector.calcSumVectors(vector, vector0));
        out.println(Vector.calcSubtractionVectors(vector, vector0));
        out.println(deepToString(Vector.randomArrayOfVectors(3, 8)));
        out.println(vector.equals(vector0));
        out.println(vector.compareTo(vector0));









    }
}
