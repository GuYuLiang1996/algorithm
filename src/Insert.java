import java.util.Arrays;

public class Insert {


    //这段代码实现了对一个整数数组进行插入排序。插入排序的思想是将数组分为已排序和未排序两个部分，
    // 然后逐个将未排序元素插入到已排序部分的正确位置，直到所有元素都被插入。具体实现中，
    // 使用一个循环遍历数组的每个元素，将当前元素与已排序部分的元素逐个比较并交换位置，直到找到当前元素的正确位置并插入。
    // 这样，随着循环的进行，已排序部分逐渐扩大，最终整个数组都被排序。
    public static void main(String[] args) {
        //创建一个int数组，里面的数组是无序的，一共10个元素
        int[] arr = {1, 2, 22, 33, 213, 4, 2, 231431, 5, 6, 7, 8, 9, 101, 1};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
