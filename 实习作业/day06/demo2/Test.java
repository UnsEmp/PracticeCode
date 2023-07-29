package day06.demo2;

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        Article[] arr = new Article[110];

        while( true ) {
            System.out.println("0: add");
            System.out.println("1: query");
            System.out.println("2: update");
            System.out.println("3: pay");
            System.out.println("请输入 0-3 表示你想要执行的操作：");
            int op;
            op = sc.nextInt();
            switch(op) {
                case 0:
                    arr[n++] = add(arr);
                    break;
                case 1:
                    query(arr, n);
                    break;
                case 2:
                    update(arr, n);
                    break;
                case 3:
                    pay(arr, n);
                    break;
                default:
                    System.exit(0);
            }
        }

    }

    public static Article add(Article[] ar){
        System.out.println("请依次输入添加商品的姓名，价格，数量");
        Article a = new Article();
        a.name = sc.next();
        a.price = sc.nextInt();
        a.buyNumber = sc.nextInt();
        return a;
    }

    public static void query(Article[] ar, int n) {
        System.out.println("商品名字\t商品价格\t购买数量");
        for(int i = 0;i < n;++i) {
            System.out.println(ar[i].name + "\t" + ar[i].price + "\t" + ar[i].buyNumber);
        }
    }

    public static void update(Article[] ar, int n) {
        System.out.println("请输入想要修改的商品, 价格， 数量：");
        Article a = new Article();
        a.name = sc.next();
        a.price = sc.nextInt();
        a.buyNumber = sc.nextInt();

        boolean flag = false;
        for(int i = 0;i < n;++i) {
            if(a.name.equals(ar[i].name)) {
                ar[i].price = a.price;
                ar[i].buyNumber = a.buyNumber;
                flag = true;
            }
        }
        if(flag) System.out.println("更新成功！");
        else System.out.println("未找到相应的商品！");
    }

    public static void pay(Article[] ar, int n) {
        System.out.println("商品名字\t商品价格\t购买数量");
        double sum = 0;
        for(int i = 0;i < n;++i) {
            System.out.println(ar[i].name + "\t" + ar[i].price + "\t" + ar[i].buyNumber);
            sum += ar[i].price * ar[i].buyNumber;
        }

        System.out.println("总价格为：" + sum);
    }
}
