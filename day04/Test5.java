package day04;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        double money, start = 0.0, submit = 0.0;
        Scanner sc = new Scanner(System.in);
        money = sc.nextDouble();
        start = money;
        start -= money * 0.1;
        money -= money * 0.1;
        money -= 5000;

        if(money >= 3000) {
            submit += 3000 * 0.03;
            money -= 3000;
        }
        else {
            submit += money * 0.03;
            money  = 0;
        }

        if(money >= 9000) {
            submit += 9000 * 0.1;
            money -= 9000;
        }
        else {
            submit += money * 0.1;
            money  = 0;
        }
        if(money >= 13000) {
            submit += 13000 * 0.2;
            money -= 13000;
        }
        else {
            submit += money * 0.2;
            money  = 0;
        }

        if(money >= 10000) {
            submit += 10000 * 0.25;
            money -= 10000;
        }
        else {
            submit += money * 0.25;
            money  = 0;
        }

        if(money >= 20000) {
            submit += 20000 * 0.3;
            money -= 20000;
        }
        else {
            submit += money * 0.3;
            money  = 0;
        }

        if(money >= 25000) {
            submit += 25000 * 0.35;
            money -= 25000;
        }
        else {
            submit += money * 0.35;
            money  = 0;
        }

        if(money > 0) submit += money * 0.45;


        System.out.println("需要交税：" + submit + " 税后工资为：" + (start - submit));
    }
}