import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int [20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100) +1;
        }
        System.out.println("The number with the minimum value is" + minValue(intArray) + ".");
        System.out.println("The number of even numbers in the given array " + numbersEven(intArray) + ".");
        System.out.println("The sum of the values of the odd numbers in the given array is " + sumOddNumbers(intArray) + ".");

        System.out.println(maxValue(intArray));
        System.out.println(numbersOdd(intArray));
        System.out.println(sumEven(intArray));
    }

    public static int maxValue (int [] intArray){
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>max){
                max = intArray[i];
            }
        }
        return max;
    }

    public static int numbersOdd (int [] intArray) {
        int counter = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                counter ++;
            }
        }
        return counter;
    }

    public static int sumEven (int [] intArry) {
        int sum = 0;
        for (int i = 0; i < intArry.length; i++) {
            if (intArry[i] % 2 == 0) {
                sum += intArry[i];
            }
        }
        return sum;
    }

    public static int minValue(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
    public static int numbersEven(int[] intArray) {
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
