package test;

public class Father {
    private void show(){
        System.out.println("show");
    }

    void show2(){
        System.out.println("show2");
    }

    protected void show3(){
        System.out.println("show3");
    }

    public void show4(){
        System.out.println("show4");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.show();
        father.show2();
        father.show3();
        father.show4();
    }
}