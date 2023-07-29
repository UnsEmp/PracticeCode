package day12.demo8;

class Outer{
    public int num = 10;
    class Inner{
        public int num = 20;
        public void show(){
            int num = 30;
            //补充代码
            System.out.println(num);
            System.out.println(new Inner().num);
            System.out.println(new Outer().num);
        }


    }
}

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();//要求分别输出30,20,10
    }
}