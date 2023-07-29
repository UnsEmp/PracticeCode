package day10.demo6;

class Fu {
    static {
        System.out.println("静态代码块Fu");
    }
    {
        System.out.println("构造代码块Fu");
    }

    public Fu() {
        System.out.println("构造方法Fu");
    }
}

/*
    静态代码块Fu
    构造代码块Fu
    构造方法Fu
    静态代码块Zi
    构造代码块Zi
    构造方法Zi


    静态代码块Fu
    静态代码块Zi
    构造代码块Fu
    构造方法Fu
    构造代码块Zi
    构造方法Zi
*/

class Zi extends Fu {
    static {
        System.out.println("静态代码块Zi");
    }
    {
        System.out.println("构造代码块Zi");
    }
    public Zi() {
        System.out.println("构造方法Zi");
    }
}

public class Test {
    public static void main(String[] args) {
        new Zi();
    }
}
