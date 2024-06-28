import java.util.Arrays;

public class Select {

    public static void main(String[] args) {

        int[] arr = {1, 2, 22, 33, 213, 4, 2, 231431, 5, 6, 7, 8, 9, 101, 1};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
