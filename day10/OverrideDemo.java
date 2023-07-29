package day10;

/*
    方法重写：
        在继承体系中，子类出现与父类相同的方法声明（方法名相同，参数列表和返回值也必须相同）

    应用场景：
        当子类需要父类的功能，而功能主体子类有自己持有的内容时，
        可以重写父类中的方法这样沿袭了父亲的功能，又
        定义了子类持有的内容


    定义手机类：phonev1
                    call(String):
                    smallBlack:语音助手（speak english）
              phonev2
                    call（String name）：打电话方法
                    smallBlack（）：语音助手（speak english， 中文）

    重载和重写总结:
    重载:同一个类中，出现方法名相同，参数列表不同的现象，与返回值无关
    重写:在于类中，出现与父类相同的方法声明的现象(方法名、参数列表、返回值类型都相同)
*/

class PhoneV1{
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void smallBlack() {
        System.out.println("speak english");
    }
}

class PhoneV2 extends PhoneV1{
    @Override //用于检测当前的方法是否是重写方法，代码安全
    public void smallBlack() {
        super.smallBlack(); //沿袭父类的内容
//        System.out.println("speak english");
        System.out.println("中文"); //特有内容
    }
}

public class OverrideDemo {
    public static void main(String[] args) {

    }
}
