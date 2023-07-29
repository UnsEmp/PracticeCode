package day05;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 案例：
 *      某公司研发部5名人员，要进行项目进展汇报演讲，现采取随机排名后进行演讲
 *      5名开发人员工号-->由用户输入
 *      22  33  35  13  88-->13 33  22  35  88
 *      规则：
 *          依次遍历数组中的每一个元素，随机生成一个索引，让当前的元素与该索引位置处的元素进行交换
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的工号");
            int code = sc.nextInt();
            arr[i] = code;//存储到数组中
        }
        //随机排名前
        System.out.println("随机排名前的数据顺序:");
        System.out.println(Arrays.toString(arr));
        //for(int i = 0;i < arr.length;i++)
        //   System.out.print(arr[i] + " ");

        //遍历数组中的每个元素，随机生成一个索引，让当前元素与该索引位置处的元素进行交换
        for(int i = 0;i < arr.length;i++){
            Random r = new Random();
            int num = r.nextInt(arr.length);//随机一个索引位置出来
            int temp = 0;//开辟第三方变量
            temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }

        System.out.println();
        System.out.println("随机排名后的数据顺序:");
        System.out.println(Arrays.toString(arr));
        //for(int i = 0;i < arr.length;i++)
        //    System.out.print(arr[i] + " ");
    }
}
