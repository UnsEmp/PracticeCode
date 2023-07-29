package day02;

import java.util.Scanner;



/*
        Scanner:德盘天入
        实现步骤
        1.导包Scanner类在javo.util包，所以需要该类导入。导包的语句需要定义在类的上面
        import java.util.Scanner;
        2.创注Scanner对家Scanner
        sc = new Scanner(System.in);
        3.接收数期
        int num = sc.nextInt();
*/


public class ScannerDemo {
    public static void main(String[] args) {
        // 2.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据:");

        //3.接受数据
        int num = sc.nextInt(); //阻塞状态，等待用户输入数据， 控制台呼入全部都是String
        System.out.println("用户输入： " + num);

    }
}
