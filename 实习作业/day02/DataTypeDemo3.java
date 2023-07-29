package day02;

/*
     强制类型转换:把一个表示数范围大的数值或者变量赋值给另外一个数范围小的变量
*/

public class DataTypeDemo3 {
    public static void main(String[] args) {
        int a = 20;//20 00000880 00000000 00000600 00010100
        // 格式，目标数据类型 变量 = (目标数据类型)(被转换的数据)
        // 注意:编译随意使用强制类型转换，因为它隐含了精度损失问题
        byte b = (byte)a;//int --> byte
        System.out.println(b);

        int i = 150;//150
        byte j = (byte) i;
        System.out.println(j);//-106
    }
}
