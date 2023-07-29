package day09;

class Teacher{
    public int num = 10;
    public static int num2 = 20;

    public void show() {
        System.out.println(num);
        System.out.println(num2);
    }
    // 静态方法中只能访问静态成员

    /*
        静态方法：
            成员变量：只能访问静态变量
            成员方法：只能访 问静态成员方法
        非静态方法：
            成员变量：可以是静态的，也可以是非静态的
            成员方法：可以是静态的，也可以是非静态的
    */
    public static void method() {
//        System.out.println(num);
        System.out.println(num2); // 静态是随着类加载而加载的，优先于对象存在，this是随着对象存在而存在的
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Math.max(1, 2));
    }
}
