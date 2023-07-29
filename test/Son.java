package test;

public class Son extends Father{
    public static void main(String[] args) {
        Son son = new Son();
        //son.show();相同包下的子类
        son.show2();
        son.show3();
        son.show4();
    }
}
