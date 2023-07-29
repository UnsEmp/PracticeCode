package day06;

/**
 *  二维数组的遍历
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3},{4,5,7,8},{6,9,20,35,56}};

        /*
            1.遍历二维数组，取出每一个一维数组
            2.遍历每一个一维数组，获取存储的元素
         */
        //for (int i = 0; i < arr.length; i++) {
        //System.out.println(arr[i]);//arr[i]-->一维数组
        //    for (int j = 0; j < arr[i].length; j++) {
        //        System.out.println(arr[i][j] );
        //   }
        //}
        printArray(arr);
    }

    /*
        需求：遍历二维数组
        两个明确：
            返回值：void
            参数列表：参数列表int arr[][]
     */
    public static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);//arr[i]-->一维数组
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] );
            }
        }
    }
}
