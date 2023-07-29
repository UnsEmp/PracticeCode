package day11.demo3;

import com.sun.deploy.pings.Pings;

public class Test {
    public static void main(String[] args) {
        BasketballSportMan ba = new BasketballSportMan("aaa", "18");
        ba.eat();
        ba.sleep();
        ba.study();

        PingSportMan pi = new PingSportMan("bbb", "20");
        pi.eat();
        pi.sleep();
        pi.study();

    }
}
