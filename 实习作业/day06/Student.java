package day06;

public class Student {
    //成员变量(属性)
    //成员变量: 跟之前定义变量的格式是一样的，只不过位置发生了改变，类中方法外//成员变量一般无需指定初始化值，存在默认值
    String name;//null
    int age;//
    String school;//null

    //成员方法(行为)
    //成员方法:跟之前定义方法的格式一样，只不过去static 关键字
    public void study(int number) {
        int age;//局部交量默认初始化值? ? ?
        //System.out.println(age);
        System.out.println("学习java开发");
    }
    //main方法不定义在此类中，原因是main方法不属于学生这个类的行为描述
//    public static void main(String[] args) {
//
//    }


}
