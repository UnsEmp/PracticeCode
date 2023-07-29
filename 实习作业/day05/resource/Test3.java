package day05;


import java.util.Arrays;

/**
 *  将数组中的元素逆序输出
 *  12 25 36 65 88 --> 88 65 36 25 12
 *
 *  思路：
 *      把0索引和arr.length-1的数据交换
 *      把1索引和aee.length-2的数据交换
 *      .....
 *      只要做到arr.length/2的时候即可
 */
public class Test3 {
    public static void main(String[] args) {
        /*
         *  第一次交换：
         *      int temp = arr[0];
         *      arr[0] = arr[arr.length - 1];
         *      arr[arr.length - 1] = temp;
         *  第二次交换：
         *      int temp = arr[1];
         *      arr[1] = arr[arr.length - 2];
         *      arr[arr.length - 2] = temp;
         *  第三次交换：
         *      int temp = arr[2];
         *      arr[2] = arr[arr.length - 3];
         *      arr[arr.length - 3] = temp;
         *      .....
         *
         */
        int arr[] = {12, 25, 36, 65, 88};
        System.out.println("原数组数据顺序为" + Arrays.toString(arr));
//        for (int i = 0;i < arr.length / 2;i++){
//            int temp = 0;
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
        for (int star = 0,end = arr.length - 1;star <= end;star++,end--){
            int temp = arr[star];
            arr[star] = arr[end];
            arr[end] = temp;
        }
        System.out.println("逆序后的数组顺序为：" + Arrays.toString(arr));
    }
}