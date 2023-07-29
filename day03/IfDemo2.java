package day03;

/*
    if语句注意事项

*/

public class IfDemo2 {
    public static void main(String[] args) {
        int x = 10;
        if(x == 10) {
            System.out.println("x等于10");
        }

        if(x > 5 || x == 10) {
            System.out.println("x等于5或者等于10");
        }
        System.out.println(("============================"));

        int a = 100;
        if(a != 100) {
            int b = 10; //编译时，int b = 10 ==> int b; b = 10; 对于编译器来说相当于两条语
        }

        int b = 98;
        if(b == 100){};
        //代码块永远执行
        {
            System.out.println("b的值为100");
            System.out.println("over");
        }
    }
}
