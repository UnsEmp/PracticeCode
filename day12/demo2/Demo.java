package day12.demo2;

/**
 * 多态的弊端：
 *      不能使用子类特有的成员
 *
 *  转型：
 *      向上转型（默认）
 *          从子到父：父类的引用只想子类对象就是向上转型
 *      向下转型
 *          从父到子：父类引用转向子类对象
 */

class Fu{
    public int age = 20;
    public void show(){
        System.out.println("fU");
    }
}

class Zi extends Fu{
    public int age = 20;
    public void show(){
        System.out.println("Zi");
    }

    public void method(){
        System.out.println("子类特有method");
    }
}


public class Demo {
    public static void main(String[] args) {
        Fu f = new Zi(); //向上转型：父类的引用指向子类对象
        System.out.println(f.age);
        f.show();

        //f.method();不能使用子类的特有的成员
        //1.直接创建子类对象
        //2.向下转型：从父类转化为子类类型
        Zi zi = (Zi)f;
        zi.method();


    }
}
