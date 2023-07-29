package day02;

/*
    第一题
        int a = 10;
        int b = 10;
        int c = 10;
        a = b ++; a = 10, b = 11
        c = -- a; a = 9, c = 9
        b = ++ a; a = 10, b = 10
        a = c --; a = 9, c = 8
            分别输出a, b, c的值 a = 9, b = 10, c = 8

    第二题:
        int x = 4;
        int y = (x++) +(++x) + (x * 10);  // 4  6   60 = 70
        分别输出x，y的值 x = 6, y = 70

    第三题
        int x = 10;
        int y = x++ + x++ + x++; // 10  11  12
        输出y的值 y = 33
*/

public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;    //a = 10,b = 11,c = 10
        c = --a;    //a = 9, b = 11,c = 9
        b = ++a;    //a = 10,b = 10,c = 9
        a = c--;    //a = 9, b = 10,c = 8
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("====================================================");
        int x = 4;
        int y = (x++) + (++x) + (x * 10);   //y = (4) + (6) + (60);x = 6;
        System.out.println(x);
        System.out.println(y);

        System.out.println("====================================================");
        int x1 = 10;
        int y1 = x1++ + x1++ + x1++;        //y = 10 + 11 + 12;x = 13;
        System.out.println(x1);
        System.out.println(y1);
    }
}
