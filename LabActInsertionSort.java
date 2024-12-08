
package labactinsertionsort;

   import java.util.Random;

    public class LabActInsertionSort {

    public static void insertionSort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.printf("%.4f\n", num);  
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[70];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0 + (1000 - 0) * rand.nextDouble();
        }

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
