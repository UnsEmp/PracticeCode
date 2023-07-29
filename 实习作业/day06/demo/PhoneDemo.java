package day06.demo;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.price = 4000;
        ph.sign = "oppo";

        ph.Connection();
        ph.Send();
    }
}
