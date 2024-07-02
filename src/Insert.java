import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;

public class Insert {


    //插入排序  从0～N上保证有序
    //第一步 0-1上有序
    //第二步 0-2上有序
    //。。。。。
    //第N步 0-N上有序
    public static void main(String[] args) {
        //创建一个int数组，里面的数组是无序的，一共10个元素
        int[] arr = {1, 2, 22, 33, 213, 4, 2, 231431, 5, 6, 7, 8, 9, 101, 1};
        insertSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void insertSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
