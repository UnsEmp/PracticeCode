package day06;

/*
    二维数组:
    二维数组也是一种容器，，不同于一维数组，该器存储的都是一维数组
    第一季度: 22 66 44
    第二季度:77 33 38
    第二季度: 25 45 65
    第四季度:11 66 99

    定义格式:
    格式1:数据类型[][] 变量名;
    格式2:数据类型[] 交量名[];
    格式3:数据类型 变量名[][]

    动态初始化:
    数类型[][] 交量名 = new 数类型[m][n]
    m: 表示这个二维数组，可以存储多少个一维数组
    n: 表示每一个一维数组，可以存储多少个元素
*/

public class ArrayDemo {
    public static void main(String[] args) {
        //二维数组有3 个一维数组
        //每一个一维数组有2个元素
        /*
        int[][] arr = new int[3][2];System.out.println(arr[o]);//是一维数组的地址值[I@d93b30System.out.printin(arr[o][0]);//0
        arr[0][0] = 20;
        System.out.printin(arr[0][0]);//20
        System.out.printin(arr);//[[I@d93b30Student[][] stus = new Student[3][2];
        */

        int[][] arr = new int[3][];
        System.out.println(arr); // [[I@d93b30
        System.out.println(arr[0]); // null

    }
}
