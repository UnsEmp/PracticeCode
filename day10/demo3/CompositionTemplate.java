package day10.demo3;

public abstract class CompositionTemplate {
    public void write() {
        System.out.println("《我的爸爸》");
        body();
        System.out.println("啊！这就是我的爸爸");
    }

    public abstract void body();
}
