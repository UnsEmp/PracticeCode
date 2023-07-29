package day05;

/**
 *  java内存分配--数组内存解析
 *      栈内存：方法运行时，进入的内存称为栈内存，局部（当前方法声明中或者方法体中声明的变量）变量都存放在此内存中
 *      堆内存：new出来的内容都会进入堆内存，并且会存在地址值
 *      方法区：字节码文件（.class）加载时进入的内存
 */
public class ArrayDemo {
    public static void main(String[] args/*这个就是方法声明中*/) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
/**1、该类的字节码文件加载近方法区，main方法存放在字节码文件中
 * 2、main方法会被JVM（虚拟机）自动调用进入栈内存
 * 3、arr数组变量在main方法中声明
 * 4、new int[3]     通过new关键字在堆内存中开辟空间，并产生地址值，因为new的长度是为3的数组，所以会划分出3块小的区域，，每个区域都有对应的索引和默认的初始化值
 * 5、将地址值赋值给main方法中的arr变量
 * 注意：每new一次，在堆内存中都是一块新的空间，堆内存的空间地址值不会出现重复现象
 */

