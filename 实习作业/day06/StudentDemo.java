package day06;

/**
 * 创建学生对象
 *      格式：
 *          类名 对象名 = new 类名();
 */
public class StudentDemo {
    public static void main(String[] args) {
        //类名 对象名 = new 类名();
        Student stu = new Student();
        System.out.println(stu);//day06.Student@d93b30
        //对象名.成员变量名

        System.out.println(stu.name);//null
        stu.name = "张三";//给成员变量赋值
        System.out.println(stu.name);//张三
        System.out.println(stu.age);//0
        stu.age = 25;
        System.out.println(stu.age);//25
        stu.school = "南京大学";
        System.out.println(stu.school);

        //成员方法
        //对象名.成员方法()

        Student stu1 = new Student();
        stu1.name = "王五";
        stu1.age = 26;
        stu1.school = "复旦大学";
        System.out.println(stu1.name + "---" + stu1.age + "---" + stu1.school);
    }
}
