package day09.test2;

class X {
    Y b = new Y();
    X() {
        System.out.println("x");
    }


}

class Y {
    Y() {
        System.out.println("Y");
    }
}

public class Z extends X {
    Y y = new Y();
    Z() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}

/*
    y
    x
    y
    z
*/

