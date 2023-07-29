package day04;

/**
 *  数组：用来存储一批数据同种类型的数据的内存区域（容器）
 *
 *  一维数组：
 *      格式：
 *          int[] arr;
 *          double[] arr;
 *
 *          数据类型 变量名[];
 *          int arr[];
 *          double arr[];
 *
 *  数组的访问：
 *      格式：数组名[索引]
 *      每一个存储到数组的元素，都会自动拥有一个编号，从0开始
 *      这个自动编号称之为数组的索引，可以通过数组的索引访问到数组中的元素
 *      数组的最大索引值是数组的长度-1
 *  数组在创建之后，即使没有赋值，也可以取值，取出的元素都是默认初始化值。
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int age = 25;
        //数据类型[] 变量名 = new 数据类型[数组的长度]
        int[] arr = new int[3];
        //char[] ch = new char[5];
        //System.out.println(arr);//[I@d93b30
        /*
            [I@d93b30
            [:一维数组
            I:表示存储数据类型为int型
            @:分隔符，无意义
            d93b30：地址值
         */
        System.out.println(arr[0]);
        //System.out.println(ch[0]);

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
