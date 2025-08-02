import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(Arrays.toString(intArray).replace("[","").replace("]",""));
        double[] doubleArray = new double[3];
        doubleArray[0] = 1.57;
        doubleArray[1] = 7.654;
        doubleArray[2] = 9.986;
        System.out.println(Arrays.toString(doubleArray).replace("[","").replace("]",""));
        float[] floatArray = new float[3];
        floatArray[0] = 1.6f;
        floatArray[1] = 1.8f;
        floatArray[2] = 2.0f;
        System.out.println(Arrays.toString(floatArray).replace("[","").replace("]",""));

        System.out.println("Задача 2");
        int[] intArray1 = {1, 2, 3};
        System.out.println(Arrays.toString(intArray1).replace("[","").replace("]",""));
        double[] doubleArray1 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(doubleArray1).replace("[","").replace("]",""));
        float[] floatArray1 = {1.6f, 1.8f, 2.0f};
        System.out.println(Arrays.toString(floatArray1).replace("[","").replace("]",""));

        System.out.println("Задача 3");
        int[] intArray2 = {3, 2, 1};
        System.out.println(Arrays.toString(intArray2).replace("[","").replace("]",""));
        double[] doubleArray2 = {9.986, 7.654, 1.57};
        System.out.println(Arrays.toString(doubleArray2).replace("[","").replace("]",""));
        float[] floatArray2 = {2.0f, 1.8f, 1.6f};
        System.out.println(Arrays.toString(floatArray2).replace("[","").replace("]",""));

        System.out.println("Задача 4");
        int[] intArray3 = {1, 2, 3};
        for (int i = 0; i < intArray3.length; i++) {
            if (intArray3[i] % 2 != 0) {
                intArray3[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArray3).replace("[","").replace("]", ""));
    }
}
