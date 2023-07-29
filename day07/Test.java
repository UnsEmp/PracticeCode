package day07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for(int i = 1;i <= 100;++i) {
            for(int j = 1;j <= 100;++j) {
                for(int k = 1;k <= 100;++k) {
                    if(809*i == 800*j+9*k+1) System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
