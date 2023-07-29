package day05;

/**
 *  方法（函数）：方法是一种语法结构，他可以把一段代码封装成一个功能，以便重复使用
 *  方法使用前必须知道：
 *          1.方法必须先创建才可以使用，该过程称之为方法的定义
 *          2.方法创建后并不是直接运行的，需要手动使用后才执行，该过程称之为方法的调用
 *  定义：
 *          public static void 方法名(){
 *              方法体；
 *          }
 *
 *          public static:修饰符
 *          方法名：符合标识符对于方法的命名
 *          方法体：完成功能的代码
 *  调用：
 *          方法名();
 *
 *  注意：方法与方法之间是平级关系，不能嵌套定义
 */
public class MethodDemo {
    public static void main(String[] args) {
        //方法调用
        eat();
        study();//声明的自定义方法可以互相调用
    }
    //定义方法
    public static void eat(){
        System.out.println("干饭");
        study();
//        public static void study(){
//            System.out.println("学习");
//        }方法不能嵌套
    }

    public static void study(){
        System.out.println("学习");
    }
}
