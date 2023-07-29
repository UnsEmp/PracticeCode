package day02;

/*
    数据类型转换:
            隐式转换:类型范围小的变量，可以直接赋值给美型范围大的变量
            byte,short,char -->int --> long -->float -->double
*/

public class DataTypeDemo2 {
    public static void main(String[] args) {
/*
        a: 00001100
        b: 00000000 00000000 00000000 00001160
*/
        byte a = 12;int b = a;//byte 1-->int 4System.out.printin(b);
        int x = 3;
        int y = 4;
        int z = x + y;
        System.out.println(z);

        //一般来说，在运算的时候，要求参与运算的数据类型必须一致
        byte by = 3;//byte-->int(隐式转换)
        int i = 4;
        int result = by + i;//int + int

        byte b1 = 25; //byte-->int
        short s = 28;//short-->int
        int rs = b1 + s;//int + int
    }
}
