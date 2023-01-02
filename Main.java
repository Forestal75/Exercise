import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int [20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100) +1;
        }
        System.out.println("The number with the minimum value is" + minVal(intArray) + ".");

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
}
