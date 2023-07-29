package test2;

import test.Father;

public class Son2 extends Father {
    public static void main(String[] args) {
        Son2 son2 = new Son2();
        //son2.show();不同包下的子类
        //son2.show2();
        son2.show3();
        son2.show4();
    }
}