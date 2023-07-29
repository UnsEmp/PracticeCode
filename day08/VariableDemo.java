package day08;

/*
    成员变量和局部变量的区别:
    1.类中的位置不同:成员变量在类中方法外，局部变量在方法内部或者方法声明上(形式参数)
    2.内存中的位置不同:成员变在雄内存，局部变量在栈内存
    3.生命周期不同:成员交量随着对象的存在而存在，随着对象的消失而消失，局部变量
    4.4.初始化值不同:成员变量有默认的初始化值，局部变量没有默认初始化值，必须先定义赋值后才能使用局部变量的名称可以和成员变量的名称一样，方法中使用的时候，采用就近原则。
*/

class Variable{
    int num = 10;
    int num2 = 50;
    public void study() {
//        int num2 = 20;
        System.out.println(num2);
    }
}

public class VariableDemo {
    public static void main(String[] args) {

    }
}
