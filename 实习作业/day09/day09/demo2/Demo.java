package day09.demo2;

/*
    继承中成员变量的关系
    A。子类中的成员变量名称不同时，直接输出
    B。子类中的成员变量和父类成员变量名称相同时，
        1.在子类方法的局部范围中查找，有就使用
        2.在子类方法的成员范围找
        3.在父类成员范围找
*/

class Father {
    public int num = 10;
    public int number = 20;

    public void show() {
        System.out.println(num + " " + number);
    }
}

class Son extends Father{
    public int num = 20;
    public int num2 = 30;

    public void print() {
        int num = 40;
        System.out.println(num);
    }
}



public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}
