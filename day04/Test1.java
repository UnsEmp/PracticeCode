package day04;

public class Test1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        switch (x){
            default:
                y++;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y=" + y);//4
        System.out.println("=================");

        int a = 2;
        int b = 3;
        switch (a){//2
            default:
                b++;//4
            case 3:
                b++;//5
            case 4:
                b++;//6
        }
        System.out.println("b=" + b);//6
    }
}
