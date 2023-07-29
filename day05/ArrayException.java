package day05;

/**
 *  数组操作两个常见的异常
 *  ArrayIndexOutOfBoundsException:索引越界异常
 *  NullPointerException:空指针异常，数组已经不存在了，表示不指向任何对象
 */
public class ArrayException {
    public static void main(String[] args) {
        int arr[] = new int[3];//0
        //System.out.println(arr[3]);
        //arr = null;//引用类型的默认值是null
        //System.out.println(arr[0]);
    }
}
