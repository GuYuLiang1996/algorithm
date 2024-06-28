import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = {1, 2, 22, 33, 213, 4, 2, 231431, 5, 6, 7, 8, 9, 101, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}