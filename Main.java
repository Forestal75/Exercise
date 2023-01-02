import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int [20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100) +1;
        }
        System.out.println("The number with the minimum value is" + minVal(intArray) + ".");
        System.out.println("The number of even numbers in the given array " + numEven(intArray) + ".");
        System.out.println("The sum of the values of the odd numbers in the given array is " + sumOddNumbers(intArray) + ".");

        System.out.println(maxVal(intArray));
    }

    public static int maxVal (int [] intArray){
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>max){
                max = intArray[i];
            }
        }
        return max;
    }

    public static int minVal(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
    public static int numEven(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int sumOddNumbers(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                sum += intArray[i];
            }
        }
        return sum;
    }
}
