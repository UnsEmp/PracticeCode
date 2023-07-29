package day02;

/*
    面试题:
        short s = 1;
        s = s + 1:

        short s = 1;
        s += 1;
        以上代码是否存在问题，如果存在请修正
        扩展赋值运算符其实隐含一个强制类型转换，所以使用扩展赋值运算符不需要考虑美型问题
*/

public class Test4 {
    public static void main(String[] args) {
        short s = 1;
        //s = (short) (s + 1);//int + int = int --> short

        s += 1;//扩展赋值运算符会自己进行强制类型转换
        System.out.println(s);
    }
}

