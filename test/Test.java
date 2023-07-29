package test;
/**
 *  访问权限修饰符：
 *        是否能访问     同一个类        同一个包中(子类无关类)          不同包的子类          不同包的无关类
 *      private           √                  ×                          ×                   ×
 *      默认               √                  √                          ×                   ×
 *      protected         √                  √                          √                   ×
 *      public            √                  √                          √                   √
 */

public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        //father.show();//同一个包中的无关类
        father.show2();
        father.show3();
        father.show4();
    }
}