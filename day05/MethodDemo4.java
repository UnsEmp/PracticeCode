package day05;

/**
 *  方法重载：
 *      方法重载指的是同一个类中定义了多个同名的方法，但每个方法具有不同的数据类型或者参数个数，这些同名的方法，构成了方法重载
 *      简单记忆：同一个类中，方法名相同，参数列表不同，与返回值无关
 *      参数列表不同：
 *          个数不同、类型不同、顺序不同
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        method(18,6);
    }

    //参数列表不同：个数不同
    public static void method(int a,int b,int c){
        System.out.println(a + b + c);
    }

    public static void method(int a,int b){
        System.out.println(a - b);
    }

    //参数列表不同，顺序不同，不建议使用
    public static void bn(double d,int a){

    }

    public static void bn(int a,double d){

    }

    //参数列表不同，类型不同
    public static void fn(int a){

    }

    public static void fn(double a){

    }


}
